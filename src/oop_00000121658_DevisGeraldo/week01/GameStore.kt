package oop_00000121658_DevisGeraldo.week01

fun main() {
    val gameTitle = "Sonic Frontiers"
    val price = 650000

    val finalPrice = calculateDiscount(price)
}

fun calculateDiscount(price: Int): Int =
    if (price > 500_000) {
        price - (price * 20 / 100)
    } else {
        price - (price * 10 / 100)
    }
