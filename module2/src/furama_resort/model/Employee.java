package furama_resort.model;

public class Employee extends Person {
    private String employeeCode;
    private String academicLevel;
    private String position;
    private int salary;

    public Employee() {
    }

    public Employee(String name, String dateOfBirth, String gender, String IDNumber, String phoneNumber, String email, String employeeCode, String academicLevel, String position, int salary) {
        super(name, dateOfBirth, gender, IDNumber, phoneNumber, email);
        this.employeeCode = employeeCode;
        this.academicLevel = academicLevel;
        this.position = position;
        this.salary = salary;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(String academicLevel) {
        this.academicLevel = academicLevel;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + " , " +
                "employeeCode : " + employeeCode +
                ", academicLevel : " + academicLevel +
                ", position : " + position +
                ", salary : " + salary;

    }

    @Override
    public String getInfor() {
        return super.getInfor() + "," + this.employeeCode + "," + this.academicLevel + "," + this.position + "," + this.salary;
    }
}
