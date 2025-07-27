package btap_tren_lop;

import java.util.Scanner;

public class bai_2 {
    public static final double PI = 3.14159265;
    public static double luythua(double r, int k){
        if(k==0) return 1;
        return r*luythua(r, k-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ban kinh r: ");
        double r = sc.nextDouble();
        System.out.print("nhap so mu k: ");
        int k = sc.nextInt();
        System.out.printf("chu vi hinh tron:%.2f\n", (2*PI*r));
        System.out.printf("dien tich hinh tron:%.2f\n",  (PI*Math.pow(r,2)));
        System.out.println("r mu k: " + luythua(r,k));
        System.out.println("can bac hai cua (r + k): "+ Math.sqrt(r+k));
        System.out.println("gia tri tuyet doi cua (r - k): "+ Math.abs(k - r));
    }
}
