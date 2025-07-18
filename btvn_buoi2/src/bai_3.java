import java.util.Scanner;
public class bai_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so nguyen a: ");
        int a = sc.nextInt();
        System.out.print("nhap so nguyen b: ");
        int b = sc.nextInt();
        System.out.println("a cong b = " + (a+b));
        System.out.println("a tru b = " + (a-b));
        System.out.println("a nhan b = " + (a*b));
        System.out.println("a chia b = "+ ((float)a/b));
        System.out.println("a chia lay du b = " + (a%b));
        if(a==b){
            System.out.println("a bang b = " + a);
        }else{
            System.out.println("a khong bang b");
        }
    }

}
