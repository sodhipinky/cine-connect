package pro.elevateme.cineconnect.service;

import org.springframework.stereotype.Service;
import pro.elevateme.cineconnect.model.User;
import pro.elevateme.cineconnect.repository.UserRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public Optional<User> findById(UUID userId) {
        return userRepository.findById(userId);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public void deleteById(UUID userId) {
        userRepository.deleteById(userId);
    }
}
