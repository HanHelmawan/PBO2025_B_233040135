package Pertemuan14;

public class StaticFinalDemo {
    public static final double PI = 3.14159;

    public static int tambah(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Nilai PI: " + StaticFinalDemo.PI);
        int hasil = StaticFinalDemo.tambah(5, 7);
        System.out.println("Hasil penjumlahan: " + hasil);
    }
}