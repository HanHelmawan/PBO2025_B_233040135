package Pertemuan10.Tugas;

public class PembayaranKartu extends Pembayaran implements Diskon {
    private String nomorKartu;

    public PembayaranKartu(double total, String nomorKartu) {
        super(total);
        this.nomorKartu = nomorKartu;
    }

    @Override
    public void prosesPembayaran() {
        double bayar = total - hitungDiskon();
        System.out.println("Pembayaran Kartu (" + nomorKartu + "): Rp " + bayar);
    }

    @Override
    public double hitungDiskon() {
        return total * 0.05; // 5% diskon
    }

    @Override
    public void infoPromo() {
        System.out.println("Promo Kartu: Diskon 5%");
    }
}

