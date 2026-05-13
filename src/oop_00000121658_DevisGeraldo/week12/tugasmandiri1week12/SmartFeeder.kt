package oop_00000121658_DevisGeraldo.week12.tugasmandiri1week12

fun dispenseKibble(
    requestedGram: Int,
    availableGram: Int,
    isJammed: Boolean
): Int {
    require(requestedGram > 0) {
        "Porsi kibble harus lebih dari 0 gr"
    }

    if (isJammed) {
        throw DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    println("Kibble berhasil dikeluarkan!")

    return availableGram - requestedGram
}

fun main() {
    var currentKibbleStock = 50


    println("=== SMART AUTO FEEDER ===")

    println("\nJadwal makan pagi:")

    try {
        currentKibbleStock = dispenseKibble(
            requestedGram = 80,
            availableGram = currentKibbleStock,
            isJammed = false
        )

        println("Makan pagi sukses!")
    }

    catch (e: DispenserJamException) {
        println("Error Dispenser: ${e.message}")
    }

    catch (e: FoodEmptyException) {
        println("Error Stok: ${e.message}")
    }

    catch (e: Exception) {
        println("Error Umum: ${e.message}")
    }

    finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }
