# Library Management System with Spring Boot

### This is a Library Management System intended for Libraries, to manage Physical book copies and customer databases. This program is created using Spring Boot and H2 Databases and for the frontend JavafX, FXML and CSS.
### There're sample schema and data sql files, for testing purposes.
### There're 3 main entities, Customer, Book and Book Copy. A Book is an abstraction of Book Copies, and a Book can have multiple Book Copies, and A Book Copy cannot exist without a Book.
### There're some constraints imposed such as a Customer can only borrow 5 books at a time, A Customer cannot be deleted if he hasn't returned all the books, A book cannot be deleted without deleting all the book copies and a Book Copy being borrowed by a customer cannot be deleted.

### This application can be used by the library to keep track of borrowing, returning book copies, and managing book, book copy and customer data.
### Happy Reading!!
