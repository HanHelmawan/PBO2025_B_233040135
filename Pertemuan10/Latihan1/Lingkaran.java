package Pertemuan10.Latihan1;

// Mendefinisikan kelas Lingkaran yang merupakan turunan (subclass) dari kelas abstrak Bentuk
public class Lingkaran extends Bentuk {

    /* Konstruktor Lingkaran yang memanggil konstruktor superclass Bentuk
     * dengan parameter jari-jari
     */
    public Lingkaran(int jari2) {
        super(jari2);
    }
    
    /*
     * Method luas di kelas Lingkaran override (ditulis ulang) dan diimplementasikan
     * dengan rumus PHI*r*r
     */
    @Override
    public double luas() {
        return PHI*jari2*jari2;
    }
}
