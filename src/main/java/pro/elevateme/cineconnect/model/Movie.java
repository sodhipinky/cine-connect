package pro.elevateme.cineconnect.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

/**
 * Represents a movie record persisted in the database.
 */
@Entity
public class Movie {
    @Id
    private UUID movieId;
    @NotBlank
    @Size(max = 200)
    private String title;
    @Size(max = 4000)
    private String synopsis;
    @NotNull
    private LocalDate releaseDate;
    @NotNull
    @Positive
    private Integer durationMinutes;
    @Size(max = 100)
    private String genre;
    @Size(max = 100)
    private String language;
    @Size(max = 500)
    private String posterUrl;
    @NotNull
    private LocalDateTime createdAt;

    /**
     * Creates an empty movie instance for JPA.
     */
    public Movie() {
    }

    /**
     * Creates a fully-initialized movie.
     *
     * @param movieId         unique identifier for the movie
     * @param title           movie title
     * @param synopsis        short description
     * @param releaseDate     release date
     * @param durationMinutes runtime in minutes
     * @param genre           primary genre
     * @param language        spoken language
     * @param posterUrl       optional poster URL
     * @param createdAt       creation timestamp
     */
    public Movie(UUID movieId,
                 String title,
                 String synopsis,
                 LocalDate releaseDate,
                 Integer durationMinutes,
                 String genre,
                 String language,
                 String posterUrl,
                 LocalDateTime createdAt) {
        this.movieId = movieId;
        this.title = title;
        this.synopsis = synopsis;
        this.releaseDate = releaseDate;
        this.durationMinutes = durationMinutes;
        this.genre = genre;
        this.language = language;
        this.posterUrl = posterUrl;
        this.createdAt = createdAt;
    }

    public UUID getMovieId() {
        return movieId;
    }

    /**
     * Updates the movie identifier.
     *
     * @param movieId new movie identifier
     */
    public void setMovieId(UUID movieId) {
        this.movieId = movieId;
    }

    /**
     * Returns the movie title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Updates the movie title.
     *
     * @param title new title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Returns the movie synopsis.
     */
    public String getSynopsis() {
        return synopsis;
    }

    /**
     * Updates the movie synopsis.
     *
     * @param synopsis new synopsis
     */
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    /**
     * Returns the release date.
     */
    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    /**
     * Updates the release date.
     *
     * @param releaseDate new release date
     */
    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * Returns the runtime in minutes.
     */
    public Integer getDurationMinutes() {
        return durationMinutes;
    }

    /**
     * Updates the runtime in minutes.
     *
     * @param durationMinutes new runtime in minutes
     */
    public void setDurationMinutes(Integer durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    /**
     * Returns the movie genre.
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Updates the movie genre.
     *
     * @param genre new genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Returns the movie language.
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Updates the movie language.
     *
     * @param language new language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * Returns the poster URL, if any.
     */
    public String getPosterUrl() {
        return posterUrl;
    }

    /**
     * Updates the poster URL.
     *
     * @param posterUrl new poster URL
     */
    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    /**
     * Returns when the movie was created.
     */
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Updates the creation timestamp.
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
        return "Movie{" +
                "movieId=" + movieId +
                ", title='" + title + '\'' +
                ", synopsis='" + synopsis + '\'' +
                ", releaseDate=" + releaseDate +
                ", durationMinutes=" + durationMinutes +
                ", genre='" + genre + '\'' +
                ", language='" + language + '\'' +
                ", posterUrl='" + posterUrl + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }

    /**
     * Equality based on all persisted fields.
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(movieId, movie.movieId)
                && Objects.equals(title, movie.title)
                && Objects.equals(synopsis, movie.synopsis)
                && Objects.equals(releaseDate, movie.releaseDate)
                && Objects.equals(durationMinutes, movie.durationMinutes)
                && Objects.equals(genre, movie.genre)
                && Objects.equals(language, movie.language)
                && Objects.equals(posterUrl, movie.posterUrl)
                && Objects.equals(createdAt, movie.createdAt);
    }

    /**
     * Hash derived from all persisted fields.
     */
    @Override
    public int hashCode() {
        return Objects.hash(movieId, title, synopsis, releaseDate, durationMinutes, genre, language, posterUrl, createdAt);
    }
}
