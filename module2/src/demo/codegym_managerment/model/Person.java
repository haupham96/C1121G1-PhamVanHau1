package ss6_inheritance.codegym_managerment.model;

public class Person{
    protected   int id;  // thuộc tính => biến instance(biến thuộc về đối tường) // bộ nhớp heap
    protected String name;   // default
    protected String address;
    protected String birthday;
    public static String a;

    public Person() {
    }

    public Person(int id, String name, String address, String birthday) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void goToBy(){
        System.out.println("di chuyển bằng chân");
    }

    @Override
    public String toString() {
        return "Con người{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
