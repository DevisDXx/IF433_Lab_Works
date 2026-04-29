package oop_00000121658_DevisGeraldo.week10.tugasmandiri1week10

fun main() {

    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 1.5))
    coinRepo.add(Coin("ETH", 10.0))
    coinRepo.add(Coin("USDT", 1000.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status: ${response.status}")
    response.data.forEach {
        println("Coin: ${it.name}, Balance: ${it.balance}")
    }

    val txRepo = WalletRepository<Transaction>()

    txRepo.add(Transaction("TX001", 500.0))
    txRepo.add(Transaction("TX002", 250.0))

    println("\nTransactions:")
    txRepo.getAll().forEach {
        println("ID: ${it.id}, Amount: ${it.amount}")
    }

    println("\nSearch 'BTC':")
    coinRepo.search("BTC").forEach {
        println(it)
    }

}