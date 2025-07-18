import java.util.Scanner;

public class bai_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập tên của bạn: ");
        String ten = sc.nextLine();
        System.out.print("nhập tuổi của bạn: ");
        String tuoi = sc.nextLine();
        System.out.print("nhập chiều cao của bạn: ");
        String cao = sc.nextLine();
        System.out.println("xin chào " + ten + ", bạn " + tuoi + " tuổi và cao " + cao + " mét.");
    }
}
