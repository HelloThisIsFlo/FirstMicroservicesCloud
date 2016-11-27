package com.shockn745.model;

/**
 * @author Kempenich Florian
 */
public class Review {


    public final int score;
    public final Person reviewer;

    public Review(int score, Person reviewer) {
        this.score = score;
        this.reviewer = reviewer;
    }
}
