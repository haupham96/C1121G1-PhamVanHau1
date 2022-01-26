package furama_resort.model;

public class Customer extends Person {
    private String customerCode;
    private String customerClass;
    private String address;

    public Customer() {
    }

    public Customer(String name, String dateOfBirth, String gender, String IDNumber, String phoneNumber, String email, String customerCode, String customerClass, String address) {
        super(name, dateOfBirth, gender, IDNumber, phoneNumber, email);
        this.customerCode = customerCode;
        this.customerClass = customerClass;
        this.address = address;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerClass() {
        return customerClass;
    }

    public void setCustomerClass(String customerClass) {
        this.customerClass = customerClass;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString() + " , " +
                "customerCode : " + this.customerCode +
                ", customerClass : " + this.customerClass +
                ", address : " + this.address ;

    }

    @Override
    public String getInfor() {
        return super.getInfor() + "," + this.customerCode + "," + this.customerClass + "," + this.address;
    }
}
