package oop_00000121658_DevisGeraldo.week04

fun main() {
    println(" --- Testing Vehicle --- ")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n --- Testing Car --- ")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n --- Testing Electric Car --- ")
    val myElectricCar = ElectricCar(brand = "Rimac", 2, 85)
    myElectricCar.accelerate()
    myElectricCar.honk()
    myElectricCar.openTrunk()
}