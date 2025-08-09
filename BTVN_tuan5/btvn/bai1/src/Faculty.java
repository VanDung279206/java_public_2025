import java.util.Scanner;

public class Faculty {
    private String name;
    private String date;
    private School school;

    public Faculty() {
        school = new School();
    }

    public Faculty(String name, String date, School school) {
        this.name = name;
        this.date = date;
        this.school = school;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten khoa: ");
        name = sc.nextLine();
        System.out.print("nhap ngay thanh lap khoa: ");
        date = sc.nextLine();
        System.out.println("nhap thong tin truong:");
        school.input();
    }

    public void output() {
        System.out.println("ten khoa: " + name);
        System.out.println("ngay thanh lap: " + date);
        school.output();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
