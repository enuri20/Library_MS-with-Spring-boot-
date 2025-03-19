package repository;

import model.BookCopy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;

public interface BookCopyRepo extends JpaRepository<BookCopy, Long> {
    List<BookCopy> findByAuthor(String author);
    @Modifying
    @Query("UPDATE BookCopy b SET b.isBorrowed = true WHERE b.bookCopyId = :bookId")
    void borrowBookCopy(@Param("bookCopyId") String bookCopyId );


}
