package com.shockn745;

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
@RequestMapping(value = "reviews")
public class ReviewsController {

    private final Util util;

    @Autowired
    public ReviewsController(Util util) {
        this.util = util;
    }

    @RequestMapping(value = "/{bookId}")
    public List<Review> getReviewForBookId(@PathVariable int bookId) {
        return util.getReviewsForBookId(bookId);
    }
}
