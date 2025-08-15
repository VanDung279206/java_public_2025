import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        LopHoc lop1 = new LopHoc("L01", "CNTT1");
        LopHoc lop2 = new LopHoc("L02", "KHMT2");

        ArrayList<SinhVien> danhSach = new ArrayList<>();

        danhSach.add(new SinhVien("SV01", "nguyen van dung", 8.5, lop1));
        danhSach.add(new SinhVien("SV02", "nguyen van dung", 9.2, lop1));
        danhSach.add(new SinhVien("SV03", "nguyen van dung", 7.8, lop2));
        danhSach.add(new SinhVien("SV04", "nguyen van dung", 9.2, lop2));
        danhSach.add(new SinhVien("SV05", "nguyen van van", 6.9, lop1));

        System.out.println("=== DANH SÁCH SINH VIÊN ===");
        for (SinhVien sv : danhSach) {
            sv.inThongTin();
        }

        double maxDiem = -1;
        ArrayList<SinhVien> svMax = new ArrayList<>();

        for (SinhVien sv : danhSach) {
            if (sv.getDiemTB() > maxDiem) {
                maxDiem = sv.getDiemTB();
                svMax.clear();
                svMax.add(sv);
            } else if (sv.getDiemTB() == maxDiem) {
                svMax.add(sv);
            }
        }


        System.out.println("\n=== SINH VIÊN CÓ ĐIỂM TB CAO NHẤT ===");
        for (SinhVien sv : svMax) {
            sv.inThongTin();
        }
    }
}
