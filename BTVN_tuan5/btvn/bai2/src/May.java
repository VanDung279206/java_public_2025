import java.util.Scanner;

public class May {
    private String maMay;
    private String tenMay;
    private String tinhTrang;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ma may: ");
        maMay = sc.nextLine();
        System.out.print("nhap ten may: ");
        tenMay = sc.nextLine();
        System.out.print("nhap tinh trang: ");
        tinhTrang = sc.nextLine();
    }

    public void xuat() {
        System.out.printf("ma may: %s, ten may: %s, tinh trang: %s\n", maMay, tenMay, tinhTrang);
    }
}
