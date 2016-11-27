package com.shockn745.data;

import com.shockn745.model.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

/**
 * @author Kempenich Florian
 */
@Repository
public class ReviewRepository {

    @Autowired
    LoadBalancerClient loadBalancerClient;

    RestTemplate restTemplate = new RestTemplate();

    public List<Review> getReviewsWithBookId(int bookId) {

        ServiceInstance reviewServiceInstance = loadBalancerClient.choose("review-service");

        URI uri = reviewServiceInstance.getUri();

        System.out.println(uri.toString() + "/reviews/" + bookId);

        List<Review> response=(List<Review>) restTemplate.getForObject(uri.toString() + "/reviews/" + bookId,
                List.class);


//        Review[] response = restTemplate.getForObject(
//                uri.toString() + "/reviews/" + bookId,
//                Review[].class
//        );

//        Review review = (Review) response.getBody()[0];
//        System.out.println(review);

//        Review[] reviewsArray = response.getBody();
//        List<Review> reviews = Arrays.asList(reviewsArray);

        System.out.println(response);










//        return reviews;
        return response;
    }

}
