package model.model;

public class Student extends Person {
    private int point;
    private String className;

    public Student(int point, String className) {
        this.point = point;
        this.className = className;
    }

    public Student(String name, String address, String dateOfBirth, int point, String className) {
        super(name, address, dateOfBirth);
        this.point = point;
        this.className = className;
    }

    public Student() {
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "point=" + point +
                ", className='" + className + '\'' +
                "} " + super.toString();
    }
}
