package pro.elevateme.cineconnect.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

/**
 * Represents a review left by a user for a movie.
 */
@Entity
public class Review {
    @Id
    @NotNull
    private UUID id;
    @NotNull
    private UUID userId;
    @NotNull
    private UUID movieId;
    @NotNull
    @Min(1)
    @Max(5)
    private Integer rating;
    @Size(max = 4000)
    private String content;
    @Size(max = 500)
    private String reactionTags;
    @NotNull
    private LocalDateTime createdAt;

    /**
     * Creates an empty review instance for JPA.
     */
    public Review() {
    }

    /**
     * Creates a fully-initialized review.
     *
     * @param id           unique identifier for the review
     * @param userId       authoring user identifier
     * @param movieId      reviewed movie identifier
     * @param rating       rating value (1-5)
     * @param content      review text
     * @param reactionTags optional reaction tags
     * @param createdAt    creation timestamp
     */
    public Review(UUID id,
                  UUID userId,
                  UUID movieId,
                  Integer rating,
                  String content,
                  String reactionTags,
                  LocalDateTime createdAt) {
        this.id = id;
        this.userId = userId;
        this.movieId = movieId;
        this.rating = rating;
        this.content = content;
        this.reactionTags = reactionTags;
        this.createdAt = createdAt;
    }

    public UUID getId() {
        return id;
    }

    /**
     * Returns the user identifier for the review author.
     */
    public UUID getUserId() {
        return userId;
    }

    /**
     * Updates the user identifier for the review author.
     *
     * @param userId new user identifier
     */
    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    /**
     * Returns the movie identifier being reviewed.
     */
    public UUID getMovieId() {
        return movieId;
    }

    /**
     * Updates the movie identifier being reviewed.
     *
     * @param movieId new movie identifier
     */
    public void setMovieId(UUID movieId) {
        this.movieId = movieId;
    }

    /**
     * Returns the rating value.
     */
    public Integer getRating() {
        return rating;
    }

    /**
     * Updates the rating value.
     *
     * @param rating new rating value
     */
    public void setRating(Integer rating) {
        this.rating = rating;
    }

    /**
     * Returns the review text.
     */
    public String getContent() {
        return content;
    }

    /**
     * Updates the review text.
     *
     * @param content new review text
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Returns any reaction tags.
     */
    public String getReactionTags() {
        return reactionTags;
    }

    /**
     * Updates reaction tags.
     *
     * @param reactionTags new reaction tags
     */
    public void setReactionTags(String reactionTags) {
        this.reactionTags = reactionTags;
    }

    /**
     * Returns when the review was created.
     */
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Updates the review creation timestamp.
     *
     * @param createdAt new creation timestamp
     */
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Returns a readable representation for logs/debugging.
     */
    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", userId=" + userId +
                ", movieId=" + movieId +
                ", rating=" + rating +
                ", content='" + content + '\'' +
                ", reactionTags='" + reactionTags + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }

    /**
     * Equality based on all persisted fields.
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Review review = (Review) o;
        return Objects.equals(id, review.id)
                && Objects.equals(userId, review.userId)
                && Objects.equals(movieId, review.movieId)
                && Objects.equals(rating, review.rating)
                && Objects.equals(content, review.content)
                && Objects.equals(reactionTags, review.reactionTags)
                && Objects.equals(createdAt, review.createdAt);
    }

    /**
     * Hash derived from all persisted fields.
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, userId, movieId, rating, content, reactionTags, createdAt);
    }
}
