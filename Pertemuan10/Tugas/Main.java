package Pertemuan10.Tugas;

public class Main {
    public static void main(String[] args) {
        PembayaranTunai tunai = new PembayaranTunai(100000);
        PembayaranKartu kartu = new PembayaranKartu(100000, "1234-5678-9012");

        tunai.infoPromo();
        tunai.prosesPembayaran();

        System.out.println();

        kartu.infoPromo();
        kartu.prosesPembayaran();
    }
}

