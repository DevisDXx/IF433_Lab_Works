package oop_00000121658_DevisGeraldo.week02.tugasmandiri2week2

import java.util.Scanner
import kotlin.random.Random

fun main() {

    val scanner = Scanner(System.`in`)

    println("=== MINI RPG BATTLE ===")

    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage Hero: ")
    val damage = scanner.nextInt()

    val hero = Hero(heroName, damage)
    var enemyHp = 100

    println("\nMusuh muncul dengan HP: $enemyHp")

    while (hero.isAlive() && enemyHp > 0) {

        println("\nMenu:")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")

        val choice = scanner.nextInt()

        if (choice == 1) {

            hero.attack("Musuh")
            enemyHp -= hero.baseDamage

            if (enemyHp < 0) {
                enemyHp = 0
            }

            println("HP Musuh sekarang: $enemyHp")

            // Jika musuh masih hidup, dia membalas
            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Musuh menyerang balik sebesar $enemyDamage!")
                hero.takeDamage(enemyDamage)
                println("HP $heroName sekarang: ${hero.hp}")
            }

        } else if (choice == 2) {
            println("$heroName kabur dari pertempuran!")
            break
        } else {
            println("Pilihan tidak valid!")
        }
    }

    // Pengumuman pemenang
    println("\n=== HASIL PERTEMPURAN ===")

    if (hero.isAlive() && enemyHp == 0) {
        println("$heroName MENANG!")
    } else if (!hero.isAlive()) {
        println("Musuh MENANG!")
    } else {
        println("Pertempuran berakhir tanpa pemenang.")
    }
}