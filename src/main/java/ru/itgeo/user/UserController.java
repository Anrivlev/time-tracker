package ru.itgeo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET, value = "/users")
    public List<User> getAllUsers() {
        return this.userService.getAllUsers();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/users/{userId}")
    public User getUser(@PathVariable String userId) {
        return this.userService.getUser(userId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/users")
    public User saveUser(@RequestBody User user) {
        return this.userService.saveUser(user);
    }
}
