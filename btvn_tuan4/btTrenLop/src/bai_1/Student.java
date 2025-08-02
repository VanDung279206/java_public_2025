package bai_1;

public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Xin chao, toi ten la " + name + ", nam nay " + age + " tuoi");
    }
}
