package furama_resort.model;

public abstract class Person {
    private String name;
    private String dateOfBirth;
    private String gender;
    private String IDNumber;
    private String phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String name, String dateOfBirth, String gender, String IDNumber, String phoneNumber, String email) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.IDNumber = IDNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name : " + this.name +
                ", dateOfBirth : " + this.dateOfBirth +
                ", gender : " + this.gender +
                ", IDNumber : " + this.IDNumber +
                ", phoneNumber : " + this.phoneNumber +
                ", email : " + this.email;
    }

    public String getInfor() {
        return this.name + "," + this.dateOfBirth + "," + this.gender + "," + this.IDNumber + "," + this.phoneNumber + "," + this.email;
    }
}
