package bai_2;

public class Main {
    public static void main(String[] args) {
        Student hocSinh = new Student("Dung", 20);
        hocSinh.setName("Dũng");
        hocSinh.setAge(19);
        System.out.print(hocSinh.getName());
        System.out.print(" " + hocSinh.getAge() + " tuoi");
    }
}
