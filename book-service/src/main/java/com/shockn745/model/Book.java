package com.shockn745.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kempenich Florian
 */
public class Book {

    public final static Book NULL = new Book("", -1, new ArrayList<>());

    public final String name;
    public final long id;
    public final List<Review> reviews;

    public Book(String name, long id, List<Review> reviews) {
        this.name = name;
        this.id = id;
        this.reviews = reviews;
    }
}
