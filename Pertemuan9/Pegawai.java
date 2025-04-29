package Pertemuan9;

public class Pegawai {
   
    protected String nama;
    protected double gaji;

    public Pegawai(String nama, double gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

     public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji: " + gaji);
    }
}
