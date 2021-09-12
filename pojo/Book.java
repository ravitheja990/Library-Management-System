package LibraryManagementSystem.pojo;

import java.util.Date;

public class Book {
    private String bookId;
    private String bookName;
    private String issueeId;
    private String issuerId;
    private Date issuedOn;

    private Date returnDueDate;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getIssueeId() {
        return issueeId;
    }

    public void setIssueeId(String issueeId) {
        this.issueeId = issueeId;
    }

    public String getIssuerId() {
        return issuerId;
    }

    public void setIssuerId(String issuerId) {
        this.issuerId = issuerId;
    }

    public Date getIssuedOn() {
        return issuedOn;
    }

    public void setIssuedOn(Date issuedOn) {
        this.issuedOn = issuedOn;
    }

    public Date getReturnDueDate() {
        return returnDueDate;
    }

    public void setReturnDueDate(Date returnDueDate) {
        this.returnDueDate = returnDueDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", bookName='" + bookName + '\'' +
                ", issueeId='" + issueeId + '\'' +
                ", issuerId='" + issuerId + '\'' +
                ", issuedOn=" + issuedOn +
                ", returnDueDate=" + returnDueDate +
                '}';
    }
}
