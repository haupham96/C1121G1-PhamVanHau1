package ss6_inheritance.codegym_managerment.model;

public class ClassStudent {
    int id;
    String className;
    int studentNumber;

    public ClassStudent() {
    }

    public ClassStudent(int id, String className, int studentNumber) {
        this.id = id;
        this.className = className;
        this.studentNumber = studentNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return "ClassStudent{" +
                "id=" + id +
                ", className='" + className + '\'' +
                ", studentNumber=" + studentNumber +
                '}';
    }
}
