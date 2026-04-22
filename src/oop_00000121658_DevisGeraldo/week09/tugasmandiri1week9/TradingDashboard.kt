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
}