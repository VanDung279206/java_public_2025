package bai_2;

public class Student {
    private String name;
    private int birthday;
    private String adress;
    private double tx1;
    private double tx2;
    private double kthp;
    private int tietNghi;

    public Student(String name, int birthday, String adress, double tx1, double tx2, double kthp, int tietNghi) {
        this.birthday = birthday;
        this.adress = adress;
        this.tx1 = tx1;
        this.tx2 = tx2;
        this.kthp = kthp;
        this.tietNghi = tietNghi;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public int getBirthday() {
        return birthday;
    }

    public double getTx1() {
        return tx1;
    }

    public double getTx2() {
        return tx2;
    }

    public double getKthp() {
        return kthp;
    }

    public int getTietNghi() {
        return tietNghi;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setTx1(double tx1) {
        this.tx1 = tx1;
    }

    public void setTx2(double tx2) {
        this.tx2 = tx2;
    }

    public void setKthp(double kthp) {
        this.kthp = kthp;
    }

    public void setTietNghi(int tietNghi) {
        this.tietNghi = tietNghi;
    }

    public int getAge() {
        return 2025 - birthday;
    }

    public double getGPA() {
        return (tx1 * 0.2) + (tx2 * 0.3) + (kthp * 0.5);
    }

    @Override
    public String toString() {
        return String.format("%-10s %-5d %-15s %.1f %.1f %.1f %-5d %.2f",
                name, birthday, adress, tx1, tx2, kthp, tietNghi, getGPA());
    }
}
