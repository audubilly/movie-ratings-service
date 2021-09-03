package io.billy.microservices.ratingsdataservice.resource;

import io.billy.microservices.ratingsdataservice.models.Ratings;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingData")
public class MovieResource {

    @RequestMapping("/{movieId}")
    public Ratings getRating(@PathVariable("movieId") String movieId){
        return new Ratings("123",4);
    }
}
