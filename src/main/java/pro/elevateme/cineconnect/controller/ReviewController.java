package pro.elevateme.cineconnect.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pro.elevateme.cineconnect.model.Review;
import pro.elevateme.cineconnect.service.ReviewService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {
    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping("createReview")
    public Review create(@Valid @RequestBody Review review) {
        return reviewService.save(review);
    }

    @GetMapping("getReview/{reviewId}")
    public ResponseEntity<Review> getById(@PathVariable UUID reviewId) {
        return reviewService.findById(reviewId)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("getReviews")
    public List<Review> getAll() {
        return reviewService.findAll();
    }

    @DeleteMapping("deleteReview/{reviewId}")
    public ResponseEntity<Void> delete(@PathVariable UUID reviewId) {
        reviewService.deleteById(reviewId);
        return ResponseEntity.noContent().build();
    }
}
