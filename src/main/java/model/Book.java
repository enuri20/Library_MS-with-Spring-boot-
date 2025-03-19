package model;



import jakarta.persistence.*;



@Entity
public abstract class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String bookId;
    private String title;
    private String author;
    private String isbn;
    private Subject subject;
    private Language language;

    public Book(String title, String author, String isbn, String s, String l) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.subject = Subject.valueOf(s);
        this.language = Language.valueOf(l);

    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
}
