import java.util.ArrayList;

public class Library {
    private ArrayList<Book> danhSachSach;

    public Library() {
        danhSachSach = new ArrayList<>();
    }

    public void themSach(Book sach) {
        danhSachSach.add(sach);
        System.out.println("Da them sach vao thu vien.\n");
    }

    public void hienThiTatCaSach(boolean hienNhaXB) {
        if (danhSachSach.isEmpty()) {
            System.out.println("Thu vien chua co sach nao.");
            return;
        }
        for (Book sach : danhSachSach) {
            sach.hienThiThongTin(hienNhaXB);
        }
    }

    public void timTheoTacGia(String tuKhoa) {
        boolean timThay = false;
        for (Book sach : danhSachSach) {
            if (sach.getTacGia().toLowerCase().contains(tuKhoa.toLowerCase())) {
                sach.hienThiThongTin(true);
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Khong tim thay sach cua tac gia: " + tuKhoa);
        }
    }

    public void xoaSachTheoMa(int ma) {
        boolean daXoa = danhSachSach.removeIf(sach -> sach.getMaSach() == ma);
        if (daXoa) {
            System.out.println("Da xoa sach co ma: " + ma);
        } else {
            System.out.println("Khong tim thay sach co ma: " + ma);
        }
    }
}
