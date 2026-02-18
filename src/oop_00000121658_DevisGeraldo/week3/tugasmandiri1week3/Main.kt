package oop_00000121658_DevisGeraldo.week3.tugasmandiri1week3

fun main() {
    val sword = Weapon("Excalibur")

    sword.damage = -50      // Harus gagal
    println("Damage: ${sword.damage}")

    sword.damage = 9999    // Harus jadi 1000
    println("Damage: ${sword.damage}")

    println("Tier: ${sword.tier}")
}
