package bai_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class quanLySinhVien {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập năm sinh: ");
        int birthday = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập địa chỉ: ");
        String adress = sc.nextLine();
        System.out.print("Điểm TX1: ");
        double tx1 = Double.parseDouble(sc.nextLine());
        System.out.print("Điểm TX2: ");
        double tx2 = Double.parseDouble(sc.nextLine());
        System.out.print("Điểm KTHP: ");
        double kthp = Double.parseDouble(sc.nextLine());
        System.out.print("Số tiết nghỉ: ");
        int tietNghi = Integer.parseInt(sc.nextLine());

        students.add(new Student(name, birthday, adress, tx1, tx2, kthp, tietNghi));
        System.out.println("Đã thêm sinh viên.");
    }

    public void editStudent() {
        System.out.print("Nhập tên sinh viên cần sửa: ");
        String name = sc.nextLine();
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                System.out.print("Sửa tên: ");
                s.setName(sc.nextLine());
                System.out.print("Sửa năm sinh: ");
                s.setBirthday(Integer.parseInt(sc.nextLine()));
                System.out.print("Sửa địa chỉ: ");
                s.setAdress(sc.nextLine());
                System.out.print("Sửa điểm TX1: ");
                s.setTx1(Double.parseDouble(sc.nextLine()));
                System.out.print("Sửa điểm TX2: ");
                s.setTx2(Double.parseDouble(sc.nextLine()));
                System.out.print("Sửa điểm KTHP: ");
                s.setKthp(Double.parseDouble(sc.nextLine()));
                System.out.print("Sửa số tiết nghỉ: ");
                s.setTietNghi(Integer.parseInt(sc.nextLine()));
                System.out.println("Đã sửa thông tin sinh viên.");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên.");
    }


    public void sortByAge() {
        Collections.sort(students, Comparator.comparing(Student::getAge));
        System.out.println("Đã sắp xếp theo tuổi.");
    }


    public void sortByGPA() {
        Collections.sort(students, Comparator.comparing(Student::getGPA).reversed());
        System.out.println("Đã sắp xếp theo GPA.");
    }


    public void sortByTietNghi() {
        Collections.sort(students, Comparator.comparing(Student::getTietNghi));
        System.out.println("Đã sắp xếp theo số tiết nghỉ.");
    }


    public void deleteStudent() {
        System.out.print("Nhập tên sinh viên cần xóa: ");
        String name = sc.nextLine();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equalsIgnoreCase(name)) {
                students.remove(i);
                System.out.println("Đã xóa sinh viên.");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên.");
    }


    public void printStudents() {
        System.out.printf("%-10s %-5s %-15s %-5s %-5s %-5s %-5s %-5s\n",
                "Tên", "Năm", "Địa chỉ", "TX1", "TX2", "KTHP", "Nghỉ", "GPA");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
