package pro.elevateme.cineconnect.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pro.elevateme.cineconnect.model.Movie;

import java.util.List;
import java.util.UUID;

public interface MovieController {
    @PostMapping("createMovie")
    Movie create(@Valid @RequestBody Movie movie);

    @GetMapping("getMovie/{movieId}")
    ResponseEntity<Movie> getById(@PathVariable UUID movieId);

    @GetMapping("getMovies")
    List<Movie> getAll();

    @DeleteMapping("deleteMovie/{movieId}")
    ResponseEntity<Void> delete(@PathVariable UUID movieId);
}
