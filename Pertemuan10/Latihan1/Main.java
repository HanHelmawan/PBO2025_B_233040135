package Pertemuan10.Latihan1;

public class Main {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(10);
        System.out.println("== Lingkaran ==");
        System.out.println("jari2: " + l.jari2);
        System.out.println("luas: " + l.luas());

        Tabung t = new Tabung(10, 5);
        System.out.println("\n== Tabung ==");
        System.out.println("jari2: " + t.jari2 + ", Tinggi: " + t.getTinggi());
        System.out.println("luas: " + t.luas());
    }
}
