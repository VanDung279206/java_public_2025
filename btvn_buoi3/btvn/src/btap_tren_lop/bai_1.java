package btap_tren_lop;

import java.util.Scanner;

public class bai_1 {
    public static boolean songuyen(int x){
        if(x<2) return false;
        for(int i=2; i*i<=x; i++){
            if(x % i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so phan tu n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("nhap mang:");
        for(int i=0; i<n; i++){
            System.out.print("a[" + (i+1) + "] = ");
            a[i] = sc.nextInt();
        }
        int tongchan = 0;
        int tongle = 0;
        int ngto = 0;
        for(int i=0; i<n; i++){
            if(a[i] % 2 ==0){
                tongchan += a[i];
            }
            if(a[i] % 2 != 0){
                tongle += a[i];
            }
            if(songuyen(a[i])){
                ngto ++;
            }
        }
        System.out.println("tong so chan: " + tongchan);
        System.out.println("tong so le: " + tongle);
        System.out.println("so luong so nguyen to trong mang: " + ngto);
    }
}
