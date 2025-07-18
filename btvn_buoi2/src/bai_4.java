import java.util.Scanner;

public class bai_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("nhap 5 so nguyen");
        for(int i=0; i<5; i++){
            System.out.print("a[" + (i+1) + "] = ");
            a[i] = sc.nextInt();
        }
        System.out.print("mang vua nhap:\t");
        for(int i=0; i<5; i++){
            System.out.print(a[i] + "\t");
        }
        System.out.println();
        int tong =0;
        for(int i=0; i<5; i++){
            tong += a[i];
        }
        System.out.println("tong cac phan tu: " + tong);
        int max = a[0];
        for(int i=1; i<5; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        System.out.println("gia tri lon nhat trong mang: " + max);
    }
}