package by.intexsoft.example.controller;

import by.intexsoft.example.model.Movie;
import by.intexsoft.example.service.MovieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@Slf4j
@RestController
@RequestMapping("/movie")
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/all")
    public Collection<Movie> getAllMovies() {
        log.info("Get all movies.");
        return movieService.getAll();
    }
}
