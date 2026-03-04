package oop_00000121658_DevisGeraldo.week05.tugasmandiri2week5

fun main() {

    val eWallet = EWallet("Devis", 50000.0)
    val creditCard = CreditCard("Devis", 100000.0)

    val paymentMethods: List<PaymentMethod> = listOf(eWallet, creditCard)

    for (method in paymentMethods) {

        println("Processing payment for ${method.accountName}")
        method.processPayment(75000.0)
        println("-----------------------")
    }
}