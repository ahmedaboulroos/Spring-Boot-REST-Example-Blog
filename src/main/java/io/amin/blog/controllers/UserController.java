package io.amin.blog.controllers;

import java.util.List;

import io.amin.blog.models.Post;
import io.amin.blog.models.Tag;
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
@RequestMapping("/api")
public class UserController {
    
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> readAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/users/{userId}")
    public User readUserById(@PathVariable int userId) {
        return userService.getUserById(userId);
    }
    
    @PostMapping("/users")
    public User createNewUser(@RequestBody User user) {
        return userService.createNewUser(user);
    }

    @PutMapping("/users/{userId}")
    public User updateExistingUser(@PathVariable int userId, @RequestBody User user) {
        return userService.updateUserDetails(userId, user);
    }
    
    @DeleteMapping("/users/{userId}")
    public User deleteExistingUser(@PathVariable int userId) {
        return userService.deleteUserById(userId);
    }

    @GetMapping("/users/{userId}/posts")
    public List<Post> readAllUserPosts(@PathVariable int userId) {
        return null;
    }

    @PostMapping("/users/{userId}/posts")
    public Post createNewUserPost(@PathVariable int userId, @RequestBody User user) {
        return null;
    }

    @GetMapping("/users/{userId}/interests")
    public List<Tag> readAllUserInterests(@PathVariable int userId) {
        return null;
    }

    @PostMapping("/users/{userId}/interests")
    public Tag createNewUserInterest(@PathVariable int userId, @RequestBody Tag tag) {
        return null;
    }

}