package Pertemuan10.Latihan2;

// Kelas utama untuk menjalankan program yang menggunakan interface Kartu
public class InterfaceMain {

    // Method main adalah titik awal eksekusi program Java
    public static void main(String[] args) {
        // Membuat objek KartuElektronik dengan kode bank "IF111" dan PIN "123"
        KartuElektronik kartu = new KartuElektronik("IF111", "123");

        /* Menampilkan hasil otentikasi dengan input PIN "123"
        Karena input sama dengan PIN yang disimpan, hasilnya akan true */
        System.out.println("Otentikasi: "+ kartu.otentikasi("123"));
    }
}
