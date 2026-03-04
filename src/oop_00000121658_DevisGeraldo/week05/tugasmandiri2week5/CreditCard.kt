package oop_00000121658_DevisGeraldo.week05.tugasmandiri2week5

class CreditCard(
    accountName: String,
    val limit: Double
) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("CreditCard payment success. Used amount: $usedAmount")
        } else {
            println("CreditCard payment declined. Limit exceeded.")
        }
    }
}