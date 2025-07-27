package btap_tren_lop;

import java.util.Scanner;

public class bai_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int a11 = 1;
        int tren = 0, duoi = n;
        int trai =0, phai = n;
        while(a11 <=n*n){
            for(int i= trai; i<phai; i++){
                a[tren][i] = a11++;
            }
            tren++;
            for(int i= tren; i<duoi; i++){
                a[i][phai - 1] = a11++;
            }
            phai--;
            for(int i= phai - 1; i>= trai; i--){
                a[duoi -1][i] = a11++;
            }
            duoi--;
            for(int i= duoi -1; i>= tren; i--){
                a[i][trai] = a11++;
            }
            trai++;
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.printf("%-3d", a[i][j]);
            }
            System.out.println();
        }
        int tong = 0;
        for (int i = 0; i < n; i++) {
            tong += a[i][i];
            tong += a[i][n - 1 - i];
        }
        if (n % 2 == 1) {
            tong -= a[n / 2][n / 2];
        }
        System.out.println("\ntong ca phan tu tren duong cheo: " + tong);
    }
}