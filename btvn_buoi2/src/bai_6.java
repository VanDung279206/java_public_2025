import java.util.Scanner;

public class bai_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] ten = new String[n];
        int[] tuoi = new int[n];
        float[] diemTB = new float[n];
        for(int i=0; i<n; i++){
            System.out.println("Sinh vien" + (i+1));
            System.out.print("nhap ho va ten cua sinh vien: ");
            ten[i] = sc.nextLine();
            System.out.print("nhap tuoi cua sinh vien: ");
            tuoi[i] = sc.nextInt();
            System.out.print("nhap diem trung binh cua sinh vien: ");
            diemTB[i] = sc.nextFloat();
            sc.nextLine();
        }
        System.out.println("danh sach sinh vien.");
        for(int i=0; i<n; i++){
            System.out.println("Tên: " + ten[i] + " - Tuổi: " + tuoi[i] + " - Điểm Trung Bình: " + diemTB[i]);
        }
        double tong = 0;
        for(int i=0; i<n; i++){
            tong += diemTB[i];
        }
        System.out.println("diem trung binh cua ca lop: " + (tong/n));
        int max = 0;
        for(int i = 1; i<n; i++){
            if(diemTB[i] > diemTB[max]){
                max = i;
            }
        }
        System.out.println("sinh viên có điểm cao nhất là: " + ten[max] + " - " + tuoi[max] + " Tuổi - " + diemTB[max] + " Điểm.");
    }

}