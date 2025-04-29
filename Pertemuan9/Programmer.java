package Pertemuan9;

public class Programmer extends Pegawai {
    private double bonus;

    public Programmer(String nama, double gaji, double bonus) {
        super(nama, gaji);
        setBonus(bonus);
    }

    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Bonus: " + bonus);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
