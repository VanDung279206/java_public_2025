import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- nhap thong tin cua sinh vien " + (i + 1) + " ---");
            students[i] = new Student();
            students[i].input();
        }

        System.out.println("\n--- thong tin sinh vien ---");
        for (int i = 0; i < n; i++) {
            System.out.println("\nsinh vien " + (i + 1) + ":");
            students[i].output();
        }
    }
}
