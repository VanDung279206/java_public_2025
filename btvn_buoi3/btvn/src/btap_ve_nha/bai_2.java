package btap_ve_nha;

import java.util.Scanner;

public class bai_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap chuoi: ");
        String chuoi = sc.nextLine();
        String dao = "";
        for (int i = chuoi.length() - 1; i >= 0; i--) {
            dao += chuoi.charAt(i);
        }
        if (chuoi.equalsIgnoreCase(dao)) {
            System.out.println(chuoi.toUpperCase());
            System.out.println("=> Chuỗi này đối xứng.");
        } else {
            System.out.println(chuoi.toLowerCase());
            System.out.println("=> Chuỗi này không đối xứng.");
        }
    }
}
