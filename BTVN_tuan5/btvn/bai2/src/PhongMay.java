import java.util.Scanner;

public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private double dienTich;
    private QuanLy quanLy;
    private May[] may;
    private int soMay;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ma phong: ");
        maPhong = sc.nextLine();
        System.out.print("nhap ten phong: ");
        tenPhong = sc.nextLine();
        System.out.print("nhap dien tich: ");
        dienTich = sc.nextDouble();
        sc.nextLine();

        quanLy = new QuanLy();
        System.out.println("nhap thong tin quan ly:");
        quanLy.nhap();

        System.out.print("nhap so luong may: ");
        soMay = sc.nextInt();
        sc.nextLine();

        may = new May[soMay];
        for (int i = 0; i < soMay; i++) {
            System.out.println("nhap thong tin may thu " + (i + 1) + ":");
            may[i] = new May();
            may[i].nhap();
        }
    }

    public void xuat() {
        System.out.printf("ma phong: %s, ten phong: %s, dien tich: %.2f\n", maPhong, tenPhong, dienTich);
        System.out.println("thong tin quan ly:");
        quanLy.xuat();
        System.out.println("danh sach may:");
        for (May m : may) {
            m.xuat();
        }
    }
}
