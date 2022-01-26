package furama_resort.model;

public class Contract {
    private int numberOfContract ;
    private String bookingCode ;
    private int depositMoney;
    private int totalMoney;
    private String customerCode ;

    public Contract() {
    }

    public Contract(int numberOfContract, String bookingCode, int depositMoney, int totalMoney, String customerCode) {
        this.numberOfContract = numberOfContract;
        this.bookingCode = bookingCode;
        this.depositMoney = depositMoney;
        this.totalMoney = totalMoney;
        this.customerCode = customerCode;
    }

    public int getNumberOfContract() {
        return numberOfContract;
    }

    public void setNumberOfContract(int numberOfContract) {
        this.numberOfContract = numberOfContract;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public int getDepositMoney() {
        return depositMoney;
    }

    public void setDepositMoney(int depositMoney) {
        this.depositMoney = depositMoney;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "numberOfContract=" + numberOfContract +
                ", bookingCode='" + bookingCode + '\'' +
                ", depositMoney=" + depositMoney +
                ", totalMoney=" + totalMoney +
                ", customerCode='" + customerCode + '\'' +
                '}';
    }
}

