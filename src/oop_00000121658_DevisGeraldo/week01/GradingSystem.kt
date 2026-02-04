package oop_00000121658_DevisGeraldo.week01

fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"
fun main() {
    var name = "Devis Geraldo"
    var score = 80

    println("Nama: $name, Nilai: $score")
    println("Status: ${calculateStatus(score)}")

    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }

    println("Grade kamu: $grade")
    val studentId: String? = null
    val idLength = studentId?.length ?: 0
    println("Panjang ID: $idLength")
}

