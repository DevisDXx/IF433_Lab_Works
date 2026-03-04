package oop_00000121658_DevisGeraldo.week05.tugasmandiri1week5

fun main() {

    val mathHelper = MathHelper()

    // Persegi
    val luasPersegi = mathHelper.hitungLuas(4)
    println("Luas Persegi: $luasPersegi")

    // Persegi panjang
    val luasPersegiPanjang = mathHelper.hitungLuas(5, 3)
    println("Luas Persegi Panjang: $luasPersegiPanjang")

    // Lingkaran
    val luasLingkaran = mathHelper.hitungLuas(7.0)
    println("Luas Lingkaran: $luasLingkaran")
}