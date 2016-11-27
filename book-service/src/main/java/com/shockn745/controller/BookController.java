package com.shockn745.controller;

import com.shockn745.data.BookRepository;
import com.shockn745.data.ReviewRepository;
import com.shockn745.model.Book;
import com.shockn745.model.Review;
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

    @Autowired
    ReviewRepository reviewRepository;

    @RequestMapping
    public List<Book> getListBooks() {
        return bookRepository.getAll();
    }

    @RequestMapping(value = "/details/{bookId}")
    public Book getBookDetails(@PathVariable int bookId) {
        return getBookWithReviews(bookId);
    }

    private Book getBookWithReviews(@PathVariable int bookId) {
        Book book = bookRepository.findById(bookId);

        if (!book.equals(Book.NULL)) {

            List<Review> reviews = reviewRepository.getReviewsWithBookId(bookId);
            book.setReviews(reviews);

            return book;
        }

        return null;
    }

}
