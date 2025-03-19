package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import service.BookService;

@Component
public class BookController {
    @Autowired
    private BookService bookService;

}
