package pro.elevateme.cineconnect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.elevateme.cineconnect.model.Movie;

import java.util.UUID;

public interface MovieRepository extends JpaRepository<Movie, UUID> {
}
