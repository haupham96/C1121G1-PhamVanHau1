package ss6_inheritance.codegym_managerment.model;

import java.util.Objects;

public class Student  extends Person implements Comparable<Student>{
    private String className;
    static String school ="BK";// biến static
    private int point=10;

    public Student() {

    }

    public Student(int id, String name, String address,
                   String birthday, String className, int point) {
        super(id, name, address, birthday);
        this.className =className;
        this.point = point;
    }
// getter và setter

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public static void setSchool(String school) {
        Student.school = school;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    // phương thức có 1 tham số
    public void study(String subject){
        study1("hóa");
        System.out.println( this.name + " đang học môn + "+ subject);
    }
    // pt đang overloading
    public  String study(){
        return "hoc tat ca các mon";
    }
    public void study(int soTiet){

    }
    // overloading
    public void study(String subject1, String subject2){
        System.out.println();
    }
    // pt static
    public static void study1(String subject){
        System.out.println(subject);
    }
//   phương thức trả về thông tin đối tượng
    @Override
    public String toString() {
        return "Sinh vien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", birthday='" + birthday + '\'' +
                ", className='" + className + '\'' +
                ", school='" + school + '\'' +
                ", point=" + point +
                '}';
    }
    @Override
    public void goToBy(){
        System.out.println("đi bằng xe máy");
    }

   // sử dụng cho hashSet và LinkedHashSet
//    @Override
//    public boolean equals(Object o) {
//        Student student =(Student)o;
//        return this.getName().equals(student.getName())&&this.getId()==student.getId();
//    }
//
//    @Override
//    public int hashCode() {
//        return 12;
//    }

// sử dụng cho  TreeMap
    @Override
    public int compareTo(Student o) {
        if (this.id-o.id==0){
            // so theo ten (a.compareTo(b) => -1 ,1,0
            return this.name.compareTo(o.name);
        }else {
            return this.id-o.id;
        }

    }
    public String getInfoToWriteCSV(){
        return this.id+","+this.name+","+this.address+","
                +this.birthday+","+this.className+","+this.point;
    }
}
