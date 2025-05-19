package Pertemuan10.Latihan1;


// Mendefinisikan kelas Tabung yang merupakan subclass dari kelas abstrak Bentuk
public class Tabung extends Bentuk {

    // Menyimpan tinggi tabung
    private int tinggi;

    // Konstruktor default Tabung, memanggil konstruktor Bentuk dengan nilai jari2 = 0
    public Tabung() {
        super(0);
    }


    /* Konstruktor dengan parameter jari2 dan tinggi
     * Memanggil konstruktor Bentuk dan mengatur nilai tinggi
     */
    public Tabung(int jari2, int tinggi) {
        super(jari2);
        this.tinggi = tinggi;
    }

    /* Method luas di kelas Lingkaran override (ditulis ulang) dan diimplementasikan
     * dengan rumus 2*PHI*r(r+t)
     */

    @Override
    public double luas() {
        return 2*PHI*jari2*(jari2+tinggi);
    }

     /* Jika method luas di kelas ini dihilangkan maka akan muncul error saat kompilasi
      * Karena class Bentuk adalah abstrak dan memiliki method abstrak luas(), 
      *maka semua class turunan wajib mengimplementasikannya kecuali mereka juga abstrak.
      */

    // Setter & Getter

    // Method getter untuk mengambil nilai tinggi
    public int getTinggi() {
        return tinggi;
    }


    // Method setter untuk mengubah nilai tinggi
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
}
