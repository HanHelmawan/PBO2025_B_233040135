package Pertemuan6;


public class MataKuliah {
    private String kode;
    private String nama;
    private String nilaiHuruf;
    private int sks;
    private String dosenPengampu;

    public MataKuliah(String kode, String nama, String nilaiHuruf, int sks, String dosenPengampu) {
        this.kode = kode;
        this.nama = nama;
        this.nilaiHuruf = nilaiHuruf;
        this.sks = sks;
        this.dosenPengampu = dosenPengampu;
    }

    public String display() {
        return "Kode: " + kode + ", Nama: " + nama + ", Dosen: " + dosenPengampu + ", Nilai: " + nilaiHuruf + ", SKS: " + sks;
    }

    public int getSks() {
        return sks;
    }

    public double nilaiIndex() {
    switch (nilaiHuruf) {
    case "A": return 4.0;
    case "AB": return 3.5;
    case "B": return 3.0;
    case "BC": return 2.5;
    case "C": return 2.0;
    case "D": return 1.0;
    case "E": return 0.0;
    default: return 0.0;
    }
 }
}
