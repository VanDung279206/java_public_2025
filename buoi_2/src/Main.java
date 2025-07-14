import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*System.out.print("hãy nhập tên : ");
        String name = sc.nextLine();
        System.out.print("hãy nhập tuổi của bạn: ");
        String age = sc.nextLine();
        System.out.print(" xin chao thang " + age + " tuoi re rach ");
    System.out.print("nhap so a: ");
    int a = sc.nextInt();
    System.out.print("nhap so b: ");
    int b = sc.nextInt();
    System.out.println("tong: " + (a + b));
    System.out.println("hieu: " + (a - b));
    System.out.println("tich: " + (a*b));
    System.out.println("thuong: " + ((float)a/b));
    System.out.println("chia du: " + (a%b));
    if (a<b){
        System.out.println(a + " nho hon " + b);
    }else if(a==b){
        System.out.println(a + " bang " + b);
        }else{
        System.out.println(a + " lon hon " + b);
        System.out.print("nhap n: ");
        int n = sc.nextInt();
        sc.nextLine();
        int[] mang = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("a[" + (i+1) + "] = ");
            mang[i] = sc.nextInt();
        }
        int tong = 0;
        for(int i=0; i<n; i++){
            tong += mang[i];
        }
        System.out.print("tong cac ptu trong mang: " + tong);*/
        tong();
    }
    public static void tong(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so a: ");
        int a = sc.nextInt();
        System.out.print("nhap so b: ");
        int b = sc.nextInt();
        System.out.println("tong: " + (a + b));
        System.out.println("hieu: " + (a - b));
        System.out.println("tich: " + (a*b));
        System.out.println("thuong: " + ((float)a/b));
        System.out.println("chia du: " + (a%b));
    }
}