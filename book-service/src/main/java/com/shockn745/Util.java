package com.shockn745;

import com.shockn745.model.Book;
import com.shockn745.model.Person;
import com.shockn745.model.Review;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Kempenich Florian
 */
@Component
public class Util {


    private Person florian;
    private Person thomas;
    private Person silvia;

    private List<Book> books;
    private List<Review> reviews;

    public Util() {
        initFakeListBooks();
    }

    private void initFakeListBooks() {
        books = new ArrayList<>();
        books.add(new Book("How to build a microservice", 1, Collections.emptyList()));
        books.add(new Book("Frankenstein", 2, Collections.emptyList()));
    }


    public List<Book> getBooks() {
        return books;
    }
}
