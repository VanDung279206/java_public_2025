package btap_tren_lop;

import java.util.Scanner;

public class bai_4 {
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        int tongLe = 0;
        System.out.print("day fibonacci tu 0 den " + n + ": ");
        for (int i = 0; i <= n; i++) {
            int fi = fibonacci(i);
            System.out.print(fi + " ");
            if (fi % 2 != 0) {
                tongLe += fi;
            }
        }
        System.out.println("\ntong cac so fibonacci le: " + tongLe);
    }
}
