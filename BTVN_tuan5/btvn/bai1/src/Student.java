import java.util.Scanner;

public class Student {
    private String name;
    private String className;
    private double score;
    private Faculty faculty;

    public Student() {
        faculty = new Faculty();
    }

    public Student(String name, String className, double score, Faculty faculty) {
        this.name = name;
        this.className = className;
        this.score = score;
        this.faculty = faculty;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten sinh vien: ");
        name = sc.nextLine();
        System.out.print("nhap ten nganh: ");
        className = sc.nextLine();
        System.out.print("nhap diem: ");
        score = sc.nextDouble();
        sc.nextLine(); // consume newline
        System.out.println("nhap thong tin khoa:");
        faculty.input();
    }

    public void output() {
        System.out.println("ten sinh vien: " + name);
        System.out.println("nganh: " + className);
        System.out.println("diem: " + score);
        faculty.output();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
}
