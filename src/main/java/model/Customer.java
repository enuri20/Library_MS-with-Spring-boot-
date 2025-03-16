package model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String customerId;
    private String firstName;
    private String LastName;
    private String email;
    private String telephone;
    private List<BookCopy> borrowedCopies;


    public Customer(String firstName, String lastName, String email, String telephone) {
        this.firstName = firstName;
        LastName = lastName;
        this.email = email;
        this.telephone = telephone;
        this.borrowedCopies = new ArrayList<>();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public List<BookCopy> getBorrowedCopies() {
        return borrowedCopies;
    }

    public void setBorrowedCopies(List<BookCopy> borrowedCopies) {
        this.borrowedCopies = borrowedCopies;
    }
}
