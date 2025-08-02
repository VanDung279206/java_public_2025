package bai_1;

public class Main {
    public static void main(String[] args) {
        Student[] a = {
                new Student("Dung", 2006, "Bac Giang", 10, 10, 10, 0),
                new Student("Dung", 2006, "Bac Giang", 10, 10, 10, 0),
                new Student("Dung", 2006, "Bac Giang", 10, 10, 10, 0),
                new Student("Dung", 2006, "Bac Giang", 10, 10, 10, 0),
                new Student("Dung", 2006, "Bac Giang", 10, 10, 10, 0)

        };
        System.out.println(
                "Tên" + "\t\t" +
                        "Tuoi" + "\t" +
                        "Dia chi" + "\t\t" +
                        "Diem tx1" + "\t" +
                        "Diem tx2" + "\t" +
                        "Diem KTHP" + "\t" +
                        "Diem GPA" + "\t" +
                        "Tiet nghi");
        for (Student s : a) {
            System.out.println(
                    s.getName() + "\t" +
                            s.getAge() + "\t\t" +
                            s.getAdress() + "\t" +
                            s.getTx1() + "\t\t" +
                            s.getTx2() + "\t\t" +
                            s.getKthp() + "\t\t" +
                            s.getGPA() + "\t\t" +
                            s.getTietNghi()
            );
        }
    }
}
