package oop_00000121658_DevisGeraldo.week05.tugasmandiri2week5

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}