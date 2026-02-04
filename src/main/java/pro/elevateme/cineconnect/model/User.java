package pro.elevateme.cineconnect.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

/**
 * Represents an application user persisted in the database.
 */
@Entity
public class User {
    @Id
    @NotNull
    private UUID userId;
    @NotBlank
    @Size(max = 50)
    private String username;
    @NotBlank
    @Email
    @Size(max = 254)
    private String email;
    @Size(max = 500)
    private String avatarUrl;
    @NotNull
    private LocalDateTime createdAt;

    /**
     * Creates an empty user instance for JPA.
     */
    public User() {
    }

    /**
     * Creates a fully-initialized user.
     *
     * @param userId    unique identifier for the user
     * @param username  display name
     * @param email     contact email
     * @param avatarUrl optional avatar image URL
     * @param createdAt creation timestamp
     */
    public User(UUID userId, String username, String email, String avatarUrl, LocalDateTime createdAt) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.avatarUrl = avatarUrl;
        this.createdAt = createdAt;
    }

    public UUID getUserId() {
        return userId;
    }

    /**
     * Returns the user's display name.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Updates the user's display name.
     *
     * @param username new display name
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Returns the user's email address.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Updates the user's email address.
     *
     * @param email new email address
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Returns the avatar URL, if any.
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * Updates the avatar URL.
     *
     * @param avatarUrl new avatar image URL
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    /**
     * Returns when the user was created.
     */
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Updates the user creation timestamp.
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
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }

    /**
     * Equality based on all persisted fields.
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userId, user.userId) && Objects.equals(username, user.username) && Objects.equals(email, user.email) && Objects.equals(avatarUrl, user.avatarUrl) && Objects.equals(createdAt, user.createdAt);
    }

    /**
     * Hash derived from all persisted fields.
     */
    @Override
    public int hashCode() {
        return Objects.hash(userId, username, email, avatarUrl, createdAt);
    }
}

