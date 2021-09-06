package io.billy.microservices.ratingsdataservice.resource;

import io.billy.microservices.ratingsdataservice.models.Ratings;
import io.billy.microservices.ratingsdataservice.models.UserRatings;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/ratingData")
public class MovieResource {

    @RequestMapping("/{movieId}")
    public Ratings getRating(@PathVariable("movieId") String movieId){
        return new Ratings(movieId,4);
    }

    @GetMapping("/users/{userId}")
    public UserRatings getUserRating(@PathVariable("userId") String userdId){
        List<Ratings> ratings = Arrays.asList(
                new Ratings("1234",4),
                new Ratings("574",8)
        );
        UserRatings userRatings = new UserRatings();
        userRatings.setUserRating(ratings);
        log.info("user ratings --{}", userRatings);
        return userRatings;
    }
}
