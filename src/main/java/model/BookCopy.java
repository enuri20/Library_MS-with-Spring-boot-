package model;

import jakarta.persistence.*;

@Entity
public class BookCopy extends Book {
    private String bookCopyId;
    private Status status;
    private Customer customer;

    public BookCopy(String title, String author, Status status, Customer customer) {
        super(title, author);
        this.status = status;
        this.customer = customer;
    }
}
