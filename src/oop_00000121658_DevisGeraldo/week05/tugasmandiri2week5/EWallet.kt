package oop_00000121658_DevisGeraldo.week05.tugasmandiri2week5

class EWallet(
    accountName: String,
    var balance: Double
) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("EWallet payment success. Remaining balance: $balance")
        } else {
            println("EWallet payment failed. Saldo tidak cukup.")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("Top up success. New balance: $balance")
    }
}