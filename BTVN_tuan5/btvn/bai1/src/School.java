import java.util.Scanner;

public class School {
    private String name;
    private String date;

    public School() {
    }

    public School(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten truong: ");
        name = sc.nextLine();
        System.out.print("nhap ngay tanh lap: ");
        date = sc.nextLine();
    }

    public void output() {
        System.out.println("ten truong: " + name);
        System.out.println("ngay thanh lap: " + date);
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
}
