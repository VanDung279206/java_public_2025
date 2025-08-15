public class Book {
    private static int nextId = 1;

    private int maSach;
    private String tuaDe;
    private String tacGia;
    private double gia;
    private Publisher nhaXuatBan;

    public Book(String tuaDe, String tacGia, double gia, Publisher nhaXuatBan) {
        this.maSach = nextId++;
        this.tuaDe = tuaDe;
        this.tacGia = tacGia;
        this.gia = gia;
        this.nhaXuatBan = nhaXuatBan;
    }

    public Book(String tuaDe, String tacGia, double gia) {
        this(tuaDe, tacGia, gia, new Publisher("Khong ro", "Khong ro"));
    }

    public int getMaSach() {
        return maSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void hienThiThongTin() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Tua de: " + tuaDe);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Gia: " + gia);
    }

    public void hienThiThongTin(boolean hienThiNhaXB) {
        hienThiThongTin();
        if (hienThiNhaXB) {
            nhaXuatBan.hienThiThongTin();
        } else {
            System.out.println("Nha xuat ban: Khong ro");
        }
        System.out.println("----------------------------");
    }
}
