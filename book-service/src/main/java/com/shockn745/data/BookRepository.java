package com.shockn745.data;

import com.shockn745.Util;
import com.shockn745.model.Book;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Kempenich Florian
 */
public class BookRepository {

    private final Util util;

    @Autowired
    public BookRepository(Util util) {
        this.util = util;
    }

    public List<Book> getAll() {
        return util.getBooks();
    }

    public Book findById(int bookId) {
        List<Book> books = util.getBooks();
        for (Book book : books) {
            if (book.id == bookId) {
                return book;
            }
        }
        return Book.NULL;
    }

}
