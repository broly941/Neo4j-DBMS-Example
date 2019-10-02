package by.intexsoft.example.service;

import by.intexsoft.example.model.User;
import by.intexsoft.example.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Collection<User> getAll() {
        return userRepository.getAllUsers();
    }

    public User getById(Long id) {
        return userRepository.findById(id).orElseThrow(IllegalStateException::new);
    }

    public User getByName(String name) {
        return userRepository.findByName(name);
    }
}
