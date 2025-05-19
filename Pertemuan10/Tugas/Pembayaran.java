package Pertemuan10.Tugas;

public abstract class Pembayaran {
    protected double total;

    public Pembayaran(double total) {
        this.total = total;
    }

    public abstract void prosesPembayaran();
}
