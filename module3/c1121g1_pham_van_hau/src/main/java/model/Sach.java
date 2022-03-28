package model;

public class Sach {
    private Integer bookId ;
    private String bookCode ;
    private String bookName ;
    private String bookAuthor ;
    private String bookAmount ;
    private String bookDescription ;

    public Sach() {
    }

    public Sach(Integer bookId, String bookCode, String bookName, String bookAuthor, String bookAmount, String bookDescription) {
        this.bookId = bookId;
        this.bookCode = bookCode;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookAmount = bookAmount;
        this.bookDescription = bookDescription;
    }

    public Sach(String bookCode, String bookName, String bookAuthor, String bookAmount, String bookDescription) {
        this.bookCode = bookCode;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookAmount = bookAmount;
        this.bookDescription = bookDescription;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookAmount() {
        return bookAmount;
    }

    public void setBookAmount(String bookAmount) {
        this.bookAmount = bookAmount;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }
}
