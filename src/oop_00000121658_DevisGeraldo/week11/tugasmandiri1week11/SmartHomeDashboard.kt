package oop_00000121658_DevisGeraldo.week11.tugasmandiri1week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    SmartDevice("Philips Wiz Living Room", "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }

    SmartDevice("Ezviz Outdoor", "Camera")
        .apply {
            isOnline = true
            powerLoad = 5
        }
        .also {
            println("LOG: Kamera terhubung")
            homeDevices.add(it)
        }
}