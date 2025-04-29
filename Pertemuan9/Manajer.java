package Pertemuan9;

public class Manajer extends Pegawai {
    private double tunjangan;

    public Manajer(String nama, double gaji, double tunjangan) {
        super(nama, gaji);
        setTunjangan(tunjangan);
        
    }

    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tunjangan: " + tunjangan);
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }
}
