package com.shockn745.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kempenich Florian
 */
public class Book {

    public final static Book NULL = new Book("", -1, new ArrayList<>());

    private String name;
    private long id;
    private List<Review> reviews;

    public Book(String name, long id, List<Review> reviews) {
        this.name = name;
        this.id = id;
        this.reviews = reviews;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}
