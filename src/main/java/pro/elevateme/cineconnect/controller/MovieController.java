package pro.elevateme.cineconnect.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pro.elevateme.cineconnect.model.Movie;
import pro.elevateme.cineconnect.service.MovieService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping("createMovie")
    public Movie create(@Valid @RequestBody Movie movie) {
        return movieService.save(movie);
    }

    @GetMapping("getMovie/{movieId}")
    public ResponseEntity<Movie> getById(@PathVariable UUID movieId) {
        return movieService.findById(movieId)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("getMovies")
    public List<Movie> getAll() {
        return movieService.findAll();
    }

    @DeleteMapping("deleteMovie/{movieId}")
    public ResponseEntity<Void> delete(@PathVariable UUID movieId) {
        movieService.deleteById(movieId);
        return ResponseEntity.noContent().build();
    }
}
