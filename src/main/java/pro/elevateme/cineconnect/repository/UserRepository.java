package pro.elevateme.cineconnect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.elevateme.cineconnect.model.User;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
