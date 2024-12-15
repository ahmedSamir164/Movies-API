package com.ahmed.movies_api.Service;

import com.ahmed.movies_api.Repo.MovieRepository;
import com.ahmed.movies_api.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository repository;

    public List<Movie> getAllMovies() {
        return repository.findAll();
    }

    public Optional<Movie> getMovieByImdbId(String imdbId) {
        return repository.findByImdbId(imdbId);
    }
}
