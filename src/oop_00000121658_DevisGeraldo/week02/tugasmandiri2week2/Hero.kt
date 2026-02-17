package oop_00000121658_DevisGeraldo.week02.tugasmandiri2week2

class Hero(
    val name: String,
    var baseDamage: Int,
    var hp: Int = 100   // Default Argument
) {

    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage

        // Logika wajib: HP tidak boleh minus
        if (hp < 0) {
            hp = 0
        }
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}