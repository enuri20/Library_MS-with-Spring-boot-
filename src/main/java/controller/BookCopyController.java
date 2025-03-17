package controller;

import model.BookCopy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.BookCopyService;

import java.util.List;

@RestController
@RequestMapping("/bookCopies")
public class BookCopyController {
    @Autowired
    private BookCopyService bookCopyService;



    @GetMapping
    public List<BookCopy> getAllBookCopies() {
        return bookCopyService.getAllBookCopies();
    }

    @PostMapping
    public void addBookCopy(BookCopy bookCopy) {
        bookCopyService.addBookCopy(bookCopy);
    }


}
