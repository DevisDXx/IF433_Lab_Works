package oop_00000121658_DevisGeraldo.TeoriWeek7

fun main() {
    println("server: ${Koneksi.linkServer}");
    Koneksi.test_koneksi()

    Mahasiswa.nama="udin";
    val na:Int = Mahasiswa.set_nilai(uts = 80, uas = 100);
    println("Nilai ${Mahasiswa.nama} adalah $na");

    Mahasiswa.isi_nama_kampus(namaUniv = "UMN")

    val dsn1 = Dosen(nama = "Indah" , nik = "12345", tahunMasuk = 2020);
    println(dsn1);
    val dsn2 = dsn1.copy(nama = "Budi", nik = "32154");
    println(dsn2);
    //cara ambil data satu-persatu field
    println("Nama dosen1: ${dsn1.nama} nasuk tahun ${dsn1.tahunMasuk}");

    // ----- Call ENUM Class -----
    println("Matkul fav saya : " + MataKuliah.OOP.name);
    println("Index Matkul : " + MataKuliah.OOP.ordinal);
    MataKuliah.OOP.sks_matkul();

    //looping munculin semua = menggunakan foreach
    for(matkul in MataKuliah.entries) {
        print("matkul: " + matkul + " ");
        matkul.sks_matkul();
    }


}