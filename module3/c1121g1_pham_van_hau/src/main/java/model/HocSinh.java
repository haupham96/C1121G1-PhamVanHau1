package model;

public class HocSinh {
    private Integer studentId;
    private String studentName;
    private String studentClass;

    public HocSinh() {
    }

    public HocSinh(Integer studentId, String studentName, String studentClass) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentClass = studentClass;
    }

    public HocSinh(String studentName, String studentClass) {
        this.studentName = studentName;
        this.studentClass = studentClass;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }
}
