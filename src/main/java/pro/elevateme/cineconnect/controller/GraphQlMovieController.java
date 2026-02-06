package pro.elevateme.cineconnect.controller;

import org.springframework.http.ResponseEntity;
import pro.elevateme.cineconnect.model.Movie;

import java.util.List;
import java.util.UUID;

public class GraphQlMovieController implements MovieController {
    @Override
    public Movie create(Movie movie) {
        return null;
    }

    @Override
    public ResponseEntity<Movie> getById(UUID movieId) {
        return null;
    }

    @Override
    public List<Movie> getAll() {
        return List.of();
    }

    @Override
    public ResponseEntity<Void> delete(UUID movieId) {
        return null;
    }
}
