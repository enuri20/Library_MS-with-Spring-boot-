package model;

import jakarta.persistence.*;


@Entity
public class BookCopy extends Book {
    private String bookCopyId;
    private Status status;
    private Customer customer;
    private boolean isBorrowed;

    public BookCopy(String title, String author,String isbn,  Status status, Customer customer, String s, String l) {
        super(title, author, isbn, s, l);
        this.status = status;
        this.customer = customer;
        this.isBorrowed = false;
    }

    public String getBookCopyId() {
        return bookCopyId;
    }

    public void setBookCopyId(String bookCopyId) {
        this.bookCopyId = bookCopyId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
}
