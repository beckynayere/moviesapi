package com.becky.movies;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//@Service
//public class MovieService {
//
//    @Autowired
//    private MovieRepository repository;
@Service
public class MovieService {

    private final MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> findAllMovies() {
        return movieRepository.findAll();
    }

//        return movieRepository.findMovieByImdbId(imdbId);
//    }
public Optional<Movie> findMovieByImdbId(String imdbId) {
    return movieRepository.findByImdbId(imdbId);  // Use the corrected method name
}
}