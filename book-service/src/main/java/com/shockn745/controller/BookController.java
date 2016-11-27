package com.shockn745.controller;

import com.shockn745.data.BookRepository;
import com.shockn745.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Kempenich Florian
 */
@RestController
@RequestMapping(value = "/books")
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @RequestMapping
    public List<Book> getListBooks() {
        return bookRepository.getAll();
    }

    @RequestMapping(value = "/details/{bookId}")
    public Book getBookDetails(@PathVariable int bookId) {
        System.out.println(bookId);
        Book result = bookRepository.findById(bookId);

        if (!result.equals(Book.NULL)) {
            return result;
        }
        return null;
    }

}
