package pro.elevateme.cineconnect.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pro.elevateme.cineconnect.model.User;
import pro.elevateme.cineconnect.service.UserService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("createUser")
    public User create(@Valid @RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping("getUser/{userId}")
    public ResponseEntity<User> getById(@PathVariable UUID userId) {
        return userService.findById(userId)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("getUsers")
    public List<User> getAll() {
        return userService.findAll();
    }

    @DeleteMapping("deleteUser/{userId}")
    public ResponseEntity<Void> delete(@PathVariable UUID userId) {
        userService.deleteById(userId);
        return ResponseEntity.noContent().build();
    }
}
