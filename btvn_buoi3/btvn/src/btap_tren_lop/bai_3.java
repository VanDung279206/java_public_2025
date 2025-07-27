package btap_tren_lop;

import java.util.Scanner;

public class bai_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap chuoi: ");
        String chuoi = scanner.nextLine();
        int start = 0;
        int end = chuoi.length() - 1;
        while (start <= end && chuoi.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && chuoi.charAt(end) == ' ') {
            end--;
        }
        String chuoi2 = "";
        for (int i = start; i <= end; i++) {
            chuoi2 += chuoi.charAt(i);
        }
        boolean checkdoixung = true;
        int n = chuoi2.length();
        for (int i = 0; i < n / 2; i++) {
            char left = chuoi2.charAt(i);
            char right = chuoi2.charAt(n - 1 - i);
            if (left >= 'A' && left <= 'Z') {
                left = (char)(left + 32);
            }
            if (right >= 'A' && right <= 'Z') {
                right = (char)(right + 32);
            }

            if (left != right) {
                checkdoixung = false;
                break;
            }
        }
        String daochuoi = "";
        for (int i = chuoi2.length() - 1; i >= 0; i--) {
            daochuoi += chuoi2.charAt(i);
        }
        if (checkdoixung) {
            System.out.println("=> chuoi la doi xung");
        } else {
            System.out.println("=> chuoi khong phai la doi xung");
        }

        System.out.println("chuoi dao nguoc: " + daochuoi);
    }
}
