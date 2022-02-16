package furama_resort.model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Booking implements Comparable<Booking> {
    private String bookingCode;
    private String dayStart;
    private String dayEnd;
    private String customerCode;
    private String nameOfService;
    private String typeOfService;

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

    public String getString() {
        return this.bookingCode + "," + this.dayStart + "," + this.dayEnd + "," + this.customerCode + "," + this.nameOfService + "," + this.typeOfService;
    }

    @Override
    public int compareTo(Booking o) {
        String[] thisDateStart = this.dayStart.split("/");
        int thisDayStart = Integer.parseInt(thisDateStart[0]);
        int thisMonthStart = Integer.parseInt(thisDateStart[1]);
        int thisYearStart = Integer.parseInt(thisDateStart[2]);

        String[] oDateStart = o.dayStart.split("/");
        int oDayStart = Integer.parseInt(oDateStart[0]);
        int oMonthStart = Integer.parseInt(oDateStart[1]);
        int oYearStart = Integer.parseInt(oDateStart[2]);

        String[] thisDateEnd = this.dayEnd.split("/");
        int thisDayEnd = Integer.parseInt(thisDateEnd[0]);
        int thisMonthEnd = Integer.parseInt(thisDateEnd[1]);
        int thisYearEnd = Integer.parseInt(thisDateEnd[2]);

        String[] oDateEnd = o.dayEnd.split("/");
        int oDayEnd = Integer.parseInt(oDateEnd[0]);
        int oMonthEnd = Integer.parseInt(oDateEnd[1]);
        int oYearEnd = Integer.parseInt(oDateEnd[2]);

        if (this.dayStart.equals(o.dayStart)) {
            if (thisYearEnd == oYearEnd) {
                if (thisMonthEnd == oMonthEnd) {
                    return thisDayEnd - oDayEnd;
                } else {
                    return thisMonthEnd - oMonthEnd;
                }
            } else {
                return thisYearEnd - oYearEnd;
            }
        } else {
            if (thisYearStart == oYearStart) {
                if (thisMonthStart == oMonthStart) {
                    return thisDayStart - oDayStart;
                } else {
                    return thisMonthStart - oMonthStart;
                }
            } else {
                return thisYearStart - oYearStart;
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return Objects.equals(bookingCode, booking.bookingCode) && Objects.equals(dayStart, booking.dayStart) && Objects.equals(dayEnd, booking.dayEnd) && Objects.equals(customerCode, booking.customerCode) && Objects.equals(nameOfService, booking.nameOfService) && Objects.equals(typeOfService, booking.typeOfService);
    }

    @Override
    public int hashCode() {
        return 2222;
    }

}
