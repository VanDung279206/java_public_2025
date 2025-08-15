import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library thuVien = new Library();
        Scanner sc = new Scanner(System.in);
        int luaChon;

        do {
            System.out.println("\n========= MENU THU VIEN =========");
            System.out.println("1. Them sach moi");
            System.out.println("2. Hien thi tat ca sach");
            System.out.println("3. Tim sach theo tac gia");
            System.out.println("4. Xoa sach theo ma");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("Nhap lua chon: ");
            luaChon = sc.nextInt();
            sc.nextLine();

            switch (luaChon) {
                case 1:
                    System.out.print("Nhap tua de: ");
                    String tuaDe = sc.nextLine();

                    System.out.print("Nhap ten tac gia: ");
                    String tacGia = sc.nextLine();

                    System.out.print("Nhap gia: ");
                    double gia = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Co thong tin nha xuat ban? (y/n): ");
                    String coNhaXB = sc.nextLine();

                    if (coNhaXB.equalsIgnoreCase("y")) {
                        System.out.print("Nhap ten nha xuat ban: ");
                        String tenNXB = sc.nextLine();

                        System.out.print("Nhap dia chi NXB: ");
                        String diaChi = sc.nextLine();

                        Publisher nxb = new Publisher(tenNXB, diaChi);
                        Book sach = new Book(tuaDe, tacGia, gia, nxb);
                        thuVien.themSach(sach);
                    } else {
                        Book sach = new Book(tuaDe, tacGia, gia);
                        thuVien.themSach(sach);
                    }
                    break;

                case 2:
                    System.out.print("Hien thong tin nha xuat ban? (y/n): ");
                    String hien = sc.nextLine();
                    boolean hienNXB = hien.equalsIgnoreCase("y");
                    thuVien.hienThiTatCaSach(hienNXB);
                    break;

                case 3:
                    System.out.print("Nhap tu khoa ten tac gia: ");
                    String tuKhoa = sc.nextLine();
                    thuVien.timTheoTacGia(tuKhoa);
                    break;

                case 4:
                    System.out.print("Nhap ma sach can xoa: ");
                    int ma = sc.nextInt();
                    sc.nextLine();
                    thuVien.xoaSachTheoMa(ma);
                    break;

                case 0:
                    System.out.println("Dang thoat chuong trinh...");
                    break;

                default:
                    System.out.println("Lua chon khong hop le.");
            }

        } while (luaChon != 0);

        sc.close();
    }
}
