package com.shockn745;

import com.shockn745.model.Book;
import com.shockn745.model.Person;
import com.shockn745.model.Review;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kempenich Florian
 */
public class Util {


    private final Person florian;
    private final Person thomas;
    private final Person silvia;

    private final List<Book> books;
    private final List<Review> reviews;

    public Util() {
        florian = new Person("Flo", "Patrick", 27);
        thomas = new Person("Thomas", "Dupuis", 56);
        silvia = new Person("Silvia", "Burdai", 14);

        reviews = new ArrayList<>();
        reviews.add(new Review(3, florian));
        reviews.add(new Review(5, silvia));
        reviews.add(new Review(4, thomas));

        books = new ArrayList<>();
        books.add(new Book("How to build a microservice", 23, reviews));
        books.add(new Book("Frankenstein", 44, reviews));

    }


    public List<Book> getBooks() {
        return books;
    }
}
