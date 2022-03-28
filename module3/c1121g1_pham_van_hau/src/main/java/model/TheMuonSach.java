package model;

public class TheMuonSach {
   private String maMuonSach ;
   private Integer booId ;
   private Integer studentId ;
   private String borrowDate ;
   private String returnDate ;

    public TheMuonSach() {
    }

    public TheMuonSach(String maMuonSach, Integer booId, Integer studentId, String borrowDate, String returnDate) {
        this.maMuonSach = maMuonSach;
        this.booId = booId;
        this.studentId = studentId;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    public String getMaMuonSach() {
        return maMuonSach;
    }

    public void setMaMuonSach(String maMuonSach) {
        this.maMuonSach = maMuonSach;
    }

    public Integer getBooId() {
        return booId;
    }

    public void setBooId(Integer booId) {
        this.booId = booId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
}
