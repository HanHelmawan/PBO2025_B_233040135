package Pertemuan10.Tugas;

public class PembayaranTunai extends Pembayaran implements Diskon {

    public PembayaranTunai(double total) {
        super(total);
    }

    @Override
    public void prosesPembayaran() {
        double bayar = total - hitungDiskon();
        System.out.println("Pembayaran Tunai: Rp " + bayar);
    }

    @Override
    public double hitungDiskon() {
        return total * 0.1; // 10% diskon
    }

    @Override
    public void infoPromo() {
        System.out.println("Promo Tunai: Diskon 10%");
    }
}
