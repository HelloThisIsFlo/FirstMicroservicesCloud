package com.shockn745;

import com.shockn745.model.Person;
import com.shockn745.model.Review;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kempenich Florian
 */
public class Util {

    private Person florian;
    private Person thomas;
    private Person silvia;

    private List<Review> reviews;

    public Util() {
        initFakeListBooks();
    }

    private void initFakeListBooks() {
        florian = new Person("Flo", "Patrick", 27);
        thomas = new Person("Thomas", "Dupuis", 56);
        silvia = new Person("Silvia", "Burdai", 14);

        reviews = new ArrayList<>();
        reviews.add(new Review(3, florian));
        reviews.add(new Review(5, silvia));
        reviews.add(new Review(4, thomas));

    }

    public List<Review> getReviewsForBookId(int bookId) {
        return reviews;
    }

}
