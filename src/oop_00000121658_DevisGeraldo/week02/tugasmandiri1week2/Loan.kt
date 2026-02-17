package oop_00000121658_DevisGeraldo.week02.tugasmandiri1week2

class Loan(
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1   // Default = 1 hari
) {

    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else {
            0
        }
    }

    fun printDetail() {
        println("=== DETAIL PEMINJAMAN ===")
        println("Judul Buku     : $bookTitle")
        println("Nama Peminjam  : $borrower")
        println("Lama Pinjam    : $loanDuration hari")
        println("Total Denda    : Rp${calculateFine()}")
    }
}