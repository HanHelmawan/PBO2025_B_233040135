package Pertemuan10.Latihan2;

// Mendefinisikan interface bernama Kartu
public interface Kartu {

    /*Method otentikasi yang akan digunakan untuk mengecek apakah PIN yang dimasukkan valid
    Method ini bersifat abstrak secara default (tidak memiliki implementasi) */ 
    public boolean otentikasi(String pin);

    /* Method encode digunakan untuk mengenkripsi atau menyamarkan PIN
     Juga bersifat abstrak dan harus diimplementasikan oleh kelas yang mengimplementasikan interface ini */
    public String encode(String pin);
}
