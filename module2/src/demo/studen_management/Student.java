package demo.studen_management;

public class Student {
    int id;
    String name;
    String address;
    String birthday;
    String className;
    String school;
    int point ;
    public Student(){
    }

    public Student(int id, String name, String address, String birthday, String className, String school, int point) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.birthday = birthday;
        this.className = className;
        this.school = school;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", birthday='" + birthday + '\'' +
                ", className='" + className + '\'' +
                ", school='" + school + '\'' +
                ", point=" + point +
                '}';
    }
}
