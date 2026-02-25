package oop_00000121658_DevisGeraldo.week04.tugasmandiri2week4

fun main() {
    val manager = Manager("Budi", 10_000_000)
    val developer = Developer("Siti", 8_000_000, "Kotlin")

    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    println()

    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}