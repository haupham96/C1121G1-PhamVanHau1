package furama_resort.model;

public class Booking {
    private String bookingCode;
    private String dayStart ;
    private String dayEnd;
    private String customerCode;
    private String nameOfService;
    private String typeOfService ;

    public Booking() {
    }

    public Booking(String bookingCode, String dayStart, String dayEnd, String customerCode, String nameOfService, String typeOfService) {
        this.bookingCode = bookingCode;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.customerCode = customerCode;
        this.nameOfService = nameOfService;
        this.typeOfService = typeOfService;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getDayStart() {
        return dayStart;
    }

    public void setDayStart(String dayStart) {
        this.dayStart = dayStart;
    }

    public String getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(String dayEnd) {
        this.dayEnd = dayEnd;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getNameOfService() {
        return nameOfService;
    }

    public void setNameOfService(String nameOfService) {
        this.nameOfService = nameOfService;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingCode='" + bookingCode + '\'' +
                ", dayStart='" + dayStart + '\'' +
                ", dayEnd='" + dayEnd + '\'' +
                ", customerCode='" + customerCode + '\'' +
                ", nameOfService='" + nameOfService + '\'' +
                ", typeOfService='" + typeOfService + '\'' +
                '}';
    }
}
