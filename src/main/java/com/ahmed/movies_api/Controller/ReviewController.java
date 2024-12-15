package com.ahmed.movies_api.Controller;

import com.ahmed.movies_api.Service.ReviewService;
import com.ahmed.movies_api.entity.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("api/v1/review")
public class ReviewController {
    @Autowired
    ReviewService reviewService;
    @PostMapping
    public ResponseEntity<Review> createReview (@RequestBody Map<String , String> payload){
        return new ResponseEntity<>(reviewService.createReview(payload.get("imdbId") , payload.get("reviewBody")) , HttpStatus.CREATED);
    }
}
