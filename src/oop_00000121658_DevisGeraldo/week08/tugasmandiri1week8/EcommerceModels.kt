package oop_00000121658_DevisGeraldo.week08.tugasmandiri1week8

sealed class Product {

    data class Electronic(
        val id: String,
        val name: String,
        val warrantyMonths: Int
    ) : Product()

    data class Clothing(
        val id: String,
        val name: String,
        val size: String
    ) : Product()
}