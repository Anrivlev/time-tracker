package ru.itgeo.timetracker.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        this.userRepository.findAll().forEach(user -> users.add(user));
        return users;
    }
    public User getUser(String id) {
        return this.userRepository.findById(id).get();
    }

    public User saveUser(User user) {
        return this.userRepository.save(user);
    }
}
