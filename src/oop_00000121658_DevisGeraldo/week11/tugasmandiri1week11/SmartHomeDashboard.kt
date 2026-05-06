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

    val acDevice = run {
        SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
    }
    homeDevices.add(acDevice)

    homeDevices.add(
        SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10)
    )

    val searchResult = homeDevices.find { it.category == "Camera" }

    searchResult?.let {
        println(it.diagnose())
    }

    with(homeDevices) {
        println("Jumlah perangkat: ${this.size}")
    }

    val totalPower = homeDevices.run {
        sumOf { it.powerLoad }
    }
    println("Total Daya: $totalPower Watt")

}