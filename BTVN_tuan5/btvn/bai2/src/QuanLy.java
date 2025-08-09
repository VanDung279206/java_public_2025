import java.util.Scanner;

public class QuanLy {
    private String maQL;
    private String hoTen;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ma quan ly: ");
        maQL = sc.nextLine();
        System.out.print("nhap ho ten quan ly: ");
        hoTen = sc.nextLine();
    }

    public void xuat() {
        System.out.printf("ma quan ly: %s, ho ten: %s\n", maQL, hoTen);
    }
}
