package com.ahmed.movies_api.Controller;

import com.ahmed.movies_api.Service.MovieService;
import com.ahmed.movies_api.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movie")
public class MovieController {
    @Autowired
    private MovieService movieService;
    @GetMapping
    public ResponseEntity<List<Movie>>getAllMovies(){
        return new ResponseEntity<>(movieService.getAllMovies() , HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>> getMovieByImdbId (@PathVariable String imdbId){
        return new ResponseEntity<>(movieService.getMovieByImdbId(imdbId) , HttpStatus.OK);
    }
}
