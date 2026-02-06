package pro.elevateme.cineconnect.service;

import org.springframework.stereotype.Service;
import pro.elevateme.cineconnect.model.Movie;
import pro.elevateme.cineconnect.repository.MovieRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    public Optional<Movie> findById(UUID movieId) {
        return movieRepository.findById(movieId);
    }

    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    public void deleteById(UUID movieId) {
        movieRepository.deleteById(movieId);
    }
}
