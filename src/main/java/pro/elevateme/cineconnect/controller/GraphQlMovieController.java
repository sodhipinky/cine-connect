package pro.elevateme.cineconnect.controller;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import pro.elevateme.cineconnect.model.Movie;
import pro.elevateme.cineconnect.service.MovieService;

import java.util.List;
import java.util.UUID;

@Controller
public class GraphQlMovieController {
    private final MovieService movieService;

    public GraphQlMovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @MutationMapping
    public Movie createMovie(@Argument Movie movie) {
        return movieService.save(movie);
    }

    @QueryMapping
    public Movie getMovie(@Argument UUID movieId) {
        return movieService.findById(movieId).orElse(null);
    }

    @QueryMapping
    public List<Movie> getMovies() {
        return movieService.findAll();
    }

    @MutationMapping
    public Boolean deleteMovie(@Argument UUID movieId) {
        movieService.deleteById(movieId);
        return true;
    }
}
