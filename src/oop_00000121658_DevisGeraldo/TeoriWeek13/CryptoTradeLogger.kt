package oop_00000121658_DevisGeraldo.TeoriWeek13
import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)

fun TradeRecord.toCsv(): String {
    return "$id,$symbol,$type,$margin,$pnl"
}

fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val parts = line.split(",")

        TradeRecord(
            id = parts[0].toInt(),
            symbol = parts[1],
            type = parts[2],
            margin = parts[3].toDouble(),
            pnl = parts[4].toDouble()
        )
    } catch (e: Exception) {
        println("(Log) Data korup diabaikan: $line")
        null
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer ->
        trades.forEach {
            writer.println(it.toCsv())
        }
    }
}

fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path)
            .readLines()
            .mapNotNull { fromCsvTrade(it) }

    } catch (e: FileNotFoundException) {
        println("File tidak ditemukan!")
        emptyList()
    }
}

fun main() {
    val trades = listOf(
        TradeRecord(1, "BTCUSDT", "Long", 5000.0, 250.5),
        TradeRecord(2, "ETHUSDT", "Short", 3000.0, -120.0),
        TradeRecord(3, "SOLUSDT", "Long", 1500.0, 90.75)
    )

    val path = "crypto_trades.csv"

    saveTrades(trades, path)

    File(path).appendText("CORRUPT_ID,DOGEUSDT,Hold,XX,YY\n")

    val loadedData = loadTrades(path)
    println("===== DATA TRADE VALID =====")

    loadedData.forEach {
        println(it)
    }

    val totalPnl = loadedData.sumOf { it.pnl }

    println("===== TOTAL PnL BERSIH: $totalPnl =====")
}