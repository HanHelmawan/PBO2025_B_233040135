package Pertemuan6;

public class TranskripNilaiMain {
    public static void main(String[] args) {
        // Create objek MataKuliah dengan dosen pengampu
        MataKuliah mk1 = new MataKuliah("001", "Algoritma Pemrograman 1", "A", 3, "FAJAR DARMAWAN, ST., M.KOM");
        MataKuliah mk2 = new MataKuliah("002", "Algoritma Pemrograman 2", "BC",3, "DR. IR LEONY LIDYA, ST., MT");
        MataKuliah mk3 = new MataKuliah("003", "Pemrograman Berorientasi Objek", "B",3, "SIROJ NUR ULUM, ST., MT");

        // Create objek KHS dengan semester
        KartuHasilStudi khs = new KartuHasilStudi("Genap 2022/2023");
        khs.addMataKuliah(mk1);
        KartuHasilStudi khs1 = new KartuHasilStudi("Ganjil 2023/2024");
        khs1.addMataKuliah(mk2);
        KartuHasilStudi khs2 = new KartuHasilStudi("Genap 2024/2025");
        khs2.addMataKuliah(mk3);

        // Create objek mahasiswa dan transkrip nilai
        Mahasiswa mhs = new Mahasiswa("303040001", "Jhon");
        TranskripNilai transkrip = new TranskripNilai(mhs);
        transkrip.addKHS(khs);

        // Hitung IPK sebelum menampilkan
        transkrip.hitungIPK();
        transkrip.display();

        // Tambah KHS lain dan hitung IPK
        transkrip.addKHS(khs1);
        transkrip.hitungIPK();
        transkrip.display();

        // Tambah KHS lain dan hitung IPK
        transkrip.addKHS(khs2);
        transkrip.hitungIPK();
        transkrip.display();
    }
}
