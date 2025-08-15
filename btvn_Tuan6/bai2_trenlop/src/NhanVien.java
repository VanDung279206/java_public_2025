public class NhanVien {
    protected String maNV;
    protected String ten;
    protected int tuoi;
    protected String email;
    protected String soDienThoai;

    public NhanVien(String maNV, String ten, int tuoi, String email, String soDienThoai) {
        this.maNV = maNV;
        this.ten = ten;
        this.tuoi = tuoi;
        this.email = email;
        this.soDienThoai = soDienThoai;
    }

    public double tinhLuong() {
        return 0;
    }

    public void hienThiThongTin() {
        System.out.println("ma nv: " + maNV);
        System.out.println("ten: " + ten);
        System.out.println("tuoi: " + tuoi);
        System.out.println("email: " + email);
        System.out.println("sdt: " + soDienThoai);
        System.out.println("luong: " + tinhLuong());
    }
}
