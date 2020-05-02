package io.amin.blog.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.amin.blog.models.User;
import io.amin.blog.services.UserService;

@RestController
@RequestMapping("/api/profiles")
public class ProfileController {
    
    @Autowired
    private UserService userService;

    
    @GetMapping
    public List<User> getAllProfiles() {
        return userService.getAllUsers();
    }

    @GetMapping("/{userId}")
    public User getProfile(@PathVariable int userId) {
        return userService.getUserById(userId);
    }
    
    @PostMapping
    public User createProfile(@RequestBody User user) {
        return userService.createNewUser(user);
    }

    @PutMapping("/{userId}")
    public User updateProfile(@PathVariable int userId, @RequestBody User user) {
        return userService.updateUserDetails(userId, user);
    }
    
    @DeleteMapping("/{userId}")
    public User deleteProfile(@PathVariable int userId) {
        return userService.deleteUserById(userId);
    }
    
}