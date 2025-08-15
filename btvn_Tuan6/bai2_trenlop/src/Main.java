public class Main {
    public static void main(String[] args) {
        QuanLyNhanVien qlnv = new QuanLyNhanVien();


        NhanVienFullTime nv1 = new NhanVienFullTime("FT01", "nguyen van dung", 30, "d@gmail.com", "0123456789", 10000000, 2000000);
        NhanVienFullTime nv2 = new NhanVienFullTime("FT02", "nguyen van dung", 28, "d@gmail.com", "0987654321", 12000000, 1500000);


        NhanVienPartTime nv3 = new NhanVienPartTime("PT01", "nguyen van dung", 22, "d@gmail.com", "0112233445", 100, 50000);
        NhanVienPartTime nv4 = new NhanVienPartTime("PT02", "nguyen van dung", 24, "d@gmail.com", "0998877665", 80, 45000);


        qlnv.themNhanVien(nv1);
        qlnv.themNhanVien(nv2);
        qlnv.themNhanVien(nv3);
        qlnv.themNhanVien(nv4);


        System.out.println("=== DANH SÁCH NHÂN VIÊN ===");
        qlnv.hienThiTatCa();


        System.out.println("TỔNG QUỸ LƯƠNG: " + qlnv.tinhTongLuong());
    }
}
