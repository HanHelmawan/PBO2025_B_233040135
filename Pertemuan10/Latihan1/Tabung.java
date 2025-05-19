package Pertemuan10.Latihan1;



public class Tabung extends Bentuk {
    private int tinggi;

    public Tabung() {
        super(0);
    }

    public Tabung(int jari2, int tinggi) {
        super(jari2);
        this.tinggi = tinggi;
    }

    /* Method luas di kelas Lingkaran override (ditulis ulang) dan diimplementasikan
     * dengan rumus 2*PHI*r(r+t)
     */

     /* Jika method luas di kelas ini dihilangkan maka akan muncul error saat kompilasi
      * Karena class Bentuk adalah abstrak dan memiliki method abstrak luas(), 
      *maka semua class turunan wajib mengimplementasikannya kecuali mereka juga abstrak.
      */

    @Override
    public double luas() {
        return 2*PHI*jari2*(jari2+tinggi);
    }

    // Setter & Getter

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
}
