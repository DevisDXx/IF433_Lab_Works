package oop_00000121658_DevisGeraldo.week02.tugasmandiri1week2

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    println("=== SISTEM DENDA PERPUSTAKAAN ===")

    print("Masukkan Judul Buku: ")
    val title = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam (hari): ")
    var duration = scanner.nextInt()

    // Validasi: tidak boleh minus
    if (duration < 0) {
        println("WARNING: Lama pinjam tidak boleh minus. Diubah menjadi 1 hari.")
        duration = 1
    }

    val loan = Loan(title, borrower, duration)

    println()
    loan.printDetail()
}