package pro.elevateme.cineconnect.service;

import org.springframework.stereotype.Service;
import pro.elevateme.cineconnect.model.Review;
import pro.elevateme.cineconnect.repository.ReviewRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ReviewService {
    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public Review save(Review review) {
        return reviewRepository.save(review);
    }

    public Optional<Review> findById(UUID reviewId) {
        return reviewRepository.findById(reviewId);
    }

    public List<Review> findAll() {
        return reviewRepository.findAll();
    }

    public void deleteById(UUID reviewId) {
        reviewRepository.deleteById(reviewId);
    }
}
