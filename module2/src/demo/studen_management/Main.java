package demo.studen_management;

public class Main {
    public static void main(String[] args) {
        StudentManagement management = new StudentManagement();
        Student student1 = new Student();
        management.add();
        management.display();
    }
}
