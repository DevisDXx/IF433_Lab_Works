package oop_00000121658_DevisGeraldo.TeoriWeek7

class Mahasiswa private constructor(val kampus:String) {
    companion object {
        var nama : String = "Unknown"

        fun set_nilai(uts:Int, uas:Int): Int {
            return (uts+uas)/2
        }
        fun isi_nama_kampus(namaUniv:String) {
            Mahasiswa(kampus = namaUniv)
        }
    }
    init {
        println("Nama kampus kamu $kampus")
    }
}