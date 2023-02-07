package com.example.ratingdataservice.resource;

import com.example.ratingdataservice.models.Rating;
import com.example.ratingdataservice.models.UserRating;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingResource {
    @GetMapping("/{movieId}")
    public Rating getRating(@PathVariable String movieId){
        return new Rating(movieId, 4);
    }

    @GetMapping("users/{userId}")
    public UserRating getUserRating(@PathVariable String userId){
        List<Rating> ratings = Arrays.asList(
                new Rating("1234", 4),
                new Rating("5678", 3)
        );
        UserRating userRating = new UserRating();
        userRating.setUserRating(ratings);
        return userRating;
    }
}
