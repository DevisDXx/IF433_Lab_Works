package oop_00000121658_DevisGeraldo.week09.tugasmandiri1week9

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 15, -10.0, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 25, 8.0, "CLOSED"),
        TradeLog("XRPUSDT", "LONG", 5, 0.0, "CLOSED"),
        TradeLog("ADAUSDT", "LONG", 10, 12.3, "OPEN")
    )
    //1
    val closedTrades = tradeHistory
        .filter { it.status == "CLOSED" }
    //2
    val winningTrades = closedTrades
        .filter { it.roe > 0 }
    //3
    val losingTrades = closedTrades
        .filter { it.roe <= 0 }
    //4
    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map {
            "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)"
        }
    //5
    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map {
            "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)"
        }
    //tmbhn
    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()
    //Output
    println("=== CRYPTO TRADING DASHBOARD ===")
    topPerformersString.forEach { println(it) }
    println("---")
    worstPerformersString.forEach { println(it) }
    println("---")
    println("Unique Pairs: $uniquePairs")
}

done