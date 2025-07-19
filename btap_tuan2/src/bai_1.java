import java.util.Scanner;

public class bai_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập vào bán kính hình tròn: ");
        double r = sc.nextFloat();
        while(r<=0 || r>=1000){
            System.out.print("nhập lại bán kính hình tròn( 0<r<1000 ): ");
            r = sc.nextFloat();
        }
        double pi = 3.14;
        System.out.printf("%.3f %.3f", (2*pi*r), (pi*r*r));
    }
}
