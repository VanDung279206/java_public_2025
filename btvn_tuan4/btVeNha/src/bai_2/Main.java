package bai_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        quanLySinhVien manager = new quanLySinhVien();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n-------- Quản lý sinh viên --------");
            System.out.println("1. Thêm sinh viên mới");
            System.out.println("2. Sửa thông tin sinh viên");
            System.out.println("3. Sắp xếp sinh viên theo tuổi");
            System.out.println("4. Sắp xếp sinh viên theo GPA");
            System.out.println("5. Sắp xếp sinh viên theo số tiết nghỉ");
            System.out.println("6. Xóa sinh viên khỏi danh sách");
            System.out.println("7. Hiển thị danh sách sinh viên");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> manager.addStudent();
                case 2 -> manager.editStudent();
                case 3 -> {
                    manager.sortByAge();
                    manager.printStudents();
                }
                case 4 -> {
                    manager.sortByGPA();
                    manager.printStudents();
                }
                case 5 -> {
                    manager.sortByTietNghi();
                    manager.printStudents();
                }
                case 6 -> manager.deleteStudent();
                case 7 -> manager.printStudents();
                case 0 -> {
                    System.out.println("Thoát chương trình.");
                    return;
                }
                default -> System.out.println("Chọn chức năng không hợp lệ.");
            }
        }
    }
}
