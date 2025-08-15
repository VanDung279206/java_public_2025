public class Publisher {
    private String ten;
    private String diaChi;

    public Publisher(String ten, String diaChi) {
        this.ten = ten;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void hienThiThongTin() {
        System.out.println("Nha xuat ban: " + ten + ", Dia chi: " + diaChi);
    }
}
