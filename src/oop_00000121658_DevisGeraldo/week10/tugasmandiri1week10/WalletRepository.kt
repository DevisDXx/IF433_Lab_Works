package oop_00000121658_DevisGeraldo.week10.tugasmandiri1week10

class WalletRepository<T> {

    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun search(keyword: String): List<T> {
        return items.filter {
            it.toString().contains(keyword, ignoreCase = true)
        }
    }
}