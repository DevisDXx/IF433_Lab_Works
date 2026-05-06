package oop_00000121658_DevisGeraldo.week11.tugasmandiri1week11

data class SmartDevice(
    var name: String,
    var category: String,
    var isOnline: Boolean = false,
    var powerLoad: Int = 0
)

// Extension
fun SmartDevice.diagnose(): String {
    return "[DIAGNOSTIK] $name | Kategori: $category | Status: ${
        if (isOnline) "Online" else "Offline"
    } | Daya: $powerLoad Watt"
}