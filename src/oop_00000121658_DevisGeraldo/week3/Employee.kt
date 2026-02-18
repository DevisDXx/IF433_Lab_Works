package oop_00000121658_DevisGeraldo.week3

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            println("Mencoba set gaji ke: $value")
            // Kode dibawah ini salah dan berbahaya
            this.salary = value
        }
}