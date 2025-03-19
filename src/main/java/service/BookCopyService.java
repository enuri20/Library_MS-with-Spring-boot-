package service;


import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import model.*;
import model.BookCopy;
import repository.BookCopyRepo;


import java.util.List;

@Service
public class BookCopyService {

    @Autowired
    private BookCopyRepo bookCopyRepo;
    public List<BookCopy> getAllBookCopies(){
        return bookCopyRepo.findAll();
    }

    public void addBookCopy(BookCopy bookCopy) {
        bookCopyRepo.save(bookCopy);
    }

    @Transactional
    public void borrowBookCopy(String bookCopyId) {
        bookCopyRepo.borrowBookCopy(bookCopyId);
    }

}
