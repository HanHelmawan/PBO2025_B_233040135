package Pertemuan10.Latihan1;

// Kelas utama (Main) untuk menjalankan program
public class Main {

    // Method utama (entry point) yang akan dijalankan pertama kali saat program dijalankan
    public static void main(String[] args) {
         // Membuat objek Lingkaran dengan jari-jari 10
        Lingkaran l = new Lingkaran(10);

        // Menampilkan informasi tentang objek Lingkaran
        System.out.println("== Lingkaran ==");
        System.out.println("jari2: " + l.jari2);
        System.out.println("luas: " + l.luas());

        // Membuat objek Tabung dengan jari-jari 10 dan tinggi 5
        Tabung t = new Tabung(10, 5);

        // Menampilkan informasi tentang objek Tabung
        System.out.println("\n== Tabung ==");
        System.out.println("jari2: " + t.jari2 + ", Tinggi: " + t.getTinggi());
        System.out.println("luas: " + t.luas());
    }
}
