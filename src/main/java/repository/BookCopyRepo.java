package repository;

import model.BookCopy;
import org.springframework.data.jpa.repository.JpaRepository;



import java.util.List;

public interface BookCopyRepo extends JpaRepository<BookCopy, Long> {
    List<BookCopy> findByAuthor(String author);

}
