package pro.elevateme.cineconnect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.elevateme.cineconnect.model.Review;

import java.util.UUID;

public interface ReviewRepository extends JpaRepository<Review, UUID> {
}
