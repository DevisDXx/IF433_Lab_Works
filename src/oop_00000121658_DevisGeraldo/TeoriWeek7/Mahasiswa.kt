package oop_00000121658_DevisGeraldo.TeoriWeek7

class Mahasiswa {
    companion object {
        var nama:String = "unknown";

        fun set_nilai(uts:Int, uas:Int):Int {
            return (uts+uas)/2;
        }
    }
}