package Pertemuan10.Latihan2;

// Mendefinisikan kelas KartuElektronik yang mengimplementasikan interface Kartu
public class KartuElektronik implements Kartu {

    // Atribut untuk menyimpan kode bank dari kartu
    private String kodeBank;
    // Atribut untuk menyimpan PIN yang tersimpan di kartu
    private String pin;

    // Konstruktor untuk menginisialisasi kode bank dan pin saat objek dibuat
    public KartuElektronik(String kodeBank, String pin) {
        super();
        this.kodeBank = kodeBank;
        this.pin = pin;
    }

    /*
     * Method otentikasi mengimplementasikan method dari interface Kartu
     * Fungsinya untuk memverifikasi apakah input PIN sama dengan PIN yang disimpan
     */

    @Override
    public boolean otentikasi(String pinInput) {
        if (pin.equals(pinInput)) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * Method encode mengimplementasikan method dari interface Kartu
     * Saat ini belum diimplementasikan (masih mengembalikan null)
     * Bisa dikembangkan untuk mengembalikan versi terenkripsi dari PIN
     */

    @Override
    public String encode(String pin) {
        return null;
    }
}
