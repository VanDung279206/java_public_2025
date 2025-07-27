package btap_ve_nha;

import java.util.Random;
import java.util.Scanner;

public class bai_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int a = rand.nextInt(101);
        int b = rand.nextInt(102);
        int tong = a + b;
        boolean hienthidung = rand.nextBoolean();
        int c;
        if(hienthidung){
            c=tong;
        }else{
            do {
                c = rand.nextInt(201);
            }while(c==tong);
        }
        System.out.println("phep toan: ");
        System.out.println(a+" + "+b+" = " + c);
        System.out.print("Du doan ket qua: ");
        String dudoan = sc.nextLine();
        boolean dudoandung = dudoan.equalsIgnoreCase("dung");
        if ((hienthidung && dudoandung) || (!hienthidung && !dudoandung)) {
            System.out.println("Bạn dự đoán đúng");
        } else {
            System.out.println("Bạn dự đoán sai");
        }
    }
}
