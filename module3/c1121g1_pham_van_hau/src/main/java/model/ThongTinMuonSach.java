package model;

public class ThongTinMuonSach {
    private String maMuonSach;
    private String bookName;
    private String studentName;
    private String studentClass;
    private String borrowDate;
    private String returnDate;
    private Integer bookId;

    public ThongTinMuonSach() {
    }

    public ThongTinMuonSach(String maMuonSach, String bookName, String studentName, String studentClass, String borrowDate, String returnDate, Integer bookId) {
        this.maMuonSach = maMuonSach;
        this.bookName = bookName;
        this.studentName = studentName;
        this.studentClass = studentClass;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.bookId = bookId;
    }

    public String getMaMuonSach() {
        return maMuonSach;
    }

    public void setMaMuonSach(String maMuonSach) {
        this.maMuonSach = maMuonSach;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
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

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }
}
