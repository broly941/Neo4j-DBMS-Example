package by.intexsoft.example.service;

import by.intexsoft.example.model.Movie;
import by.intexsoft.example.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Collection<Movie> getAll() {
        return movieRepository.getAllMovies();
    }
}
