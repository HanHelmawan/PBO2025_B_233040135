package Pertemuan9;

public class Main {
    public static void main(String[] args) {
        Pegawai p1 = new Manajer("Azhar Fauzi", 7000000, 2000000);
        Pegawai p2 = new Programmer("Fadil Sugema", 5000000, 1500000);

        System.out.println("Data Manajer:");
        p1.tampilkanInfo();
        System.out.println();

        System.out.println("Data Programmer:");
        p2.tampilkanInfo();
    }
} 

