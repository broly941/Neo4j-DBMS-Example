package by.intexsoft.example.controller;

import by.intexsoft.example.model.User;
import by.intexsoft.example.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public Collection<User> getAllUsers() {
        log.info("Get all users.");
        return userService.getAll();
    }

    @GetMapping("{id}")
    public User getUserById(@PathVariable Long id) {
        log.info("Get user by id: {}.", id);
        return userService.getById(id);
    }

    @GetMapping
    public User getUserByName(@RequestParam String name) {
        log.info("Get user by name: {}.", name);
        return userService.getByName(name);
    }
}
