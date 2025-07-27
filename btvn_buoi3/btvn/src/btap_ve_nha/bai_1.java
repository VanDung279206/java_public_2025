package btap_ve_nha;

import java.util.Scanner;

public class bai_1 {
    public static final String vuong = "Square";
    public static final String tamgiac = "Triangle";
    public static final String tron = "Circle";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap hinh dang vien gach (Square, Triangle, Circle): ");
        String hinhdang = sc.nextLine();
        double dientich =0;
        if (hinhdang.equalsIgnoreCase(vuong)) {
            System.out.print("Nhập cạnh của hình vuông: ");
            double side = sc.nextDouble();
            dientich = side * side;
            System.out.println("Diện tích hình vuông: " + dientich);

        } else if (hinhdang.equalsIgnoreCase(tamgiac)) {
            System.out.print("Nhập chiều cao: ");
            double height = sc.nextDouble();
            System.out.print("Nhập đáy: ");
            double base = sc.nextDouble();
            dientich = 0.5 * base * height;
            System.out.println("Diện tích hình tam giác: " + dientich);

        } else if (hinhdang.equalsIgnoreCase(tron)) {
            System.out.print("Nhập bán kính: ");
            double radius = sc.nextDouble();
            final double PI = 3.14159265;
            dientich = PI * radius * radius;
            System.out.println("Diện tích hình tròn: " + dientich);

        } else {
            System.out.println("Hình dạng không hợp lệ!");
        }
    }
}
