package oop_00000121658_DevisGeraldo.week04

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {

    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }

    override fun honk() {
        println("TIN TIN! Mobile $brand lewat!")
    }

    override fun accelerate() {
        super.accelerate()
        print("Mobile $brand menggunakan transmisi gigi untuk menambah kecepatan.")
    }
}