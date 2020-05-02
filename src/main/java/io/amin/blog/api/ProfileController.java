package io.amin.blog.api;

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
    public String getAllProfiles() {
        return "user";
    }

    @GetMapping("/{id}")
    public User getProfile(@PathVariable int id) {
        return null;
    }
    
    @PostMapping
    public User createProfile(@RequestBody User user) {
        return null;
    }

    @PutMapping("/{id}")
    public User updateProfile(@PathVariable int id, @RequestBody User user) {
        return null;
    }
    
    @DeleteMapping("/{id}")
    public User deleteProfile(@PathVariable int id) {
        return null;
    }
    
}