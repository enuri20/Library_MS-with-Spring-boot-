package model;

import jakarta.persistence.*;


@Entity
public class BookCopy extends Book {
    private String bookCopyId;
    private Status status;
    private Customer customer;

    public BookCopy(String title, String author,String isbn,  Status status, Customer customer) {
        super(title, author, isbn);
        this.status = status;
        this.customer = customer;
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
}
