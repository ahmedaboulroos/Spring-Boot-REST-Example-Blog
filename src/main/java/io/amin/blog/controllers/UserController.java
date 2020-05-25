package io.amin.blog.controllers;

import io.amin.blog.services.PostService;
import io.amin.blog.services.UserService;
import io.amin.blog.services.dto.*;
import io.amin.blog.services.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;
    private final PostService postService;

    public UserController(UserServiceImpl userService, PostService postService) {
        this.userService = userService;
        this.postService = postService;
    }

    @GetMapping("/users")
    public List<UserDto> readAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/users/{userId}")
    public UserDto getUserById(@PathVariable int userId) {
        return userService.getUserById(userId);
    }

    @PostMapping("/users")
    public UserDto createNewUser(@RequestBody UserDto userDto) {
        return userService.createNewUser(userDto);
    }

    @PutMapping("/users/{userId}")
    public UserDto updateExistingUser(@PathVariable int userId, @RequestBody UserDto userDto) {
        return userService.updateUserDetails(userId, userDto);
    }

    @DeleteMapping("/users/{userId}")
    public void deleteExistingUserById(@PathVariable int userId) {
        userService.deleteUserById(userId);
    }


    @GetMapping("/users/{userId}/roles")
    public List<RoleDto> getAllUserRoles(@PathVariable int userId) {
        return userService.getUserRoles(userId);
    }

    @GetMapping("/users/{userId}/posts")
    public List<PostDto> getAllUserPosts(@PathVariable int userId) {
        return postService.getPostsByUserId(userId);
    }

    @GetMapping("/users/{userId}/comments")
    public List<CommentDto> getAllUserComments(@PathVariable int userId) {
        return userService.getUserComments(userId);
    }

    @GetMapping("/users/{userId}/interests")
    public List<TagDto> getAllUserInterests(@PathVariable int userId) {
        return userService.getUserInterests(userId);
    }

    @PostMapping("/users/{userId}/interests")
    public void addUserInterest(@PathVariable int userId, @RequestBody TagDto tagDto) {
        userService.addUserInterest(userId, tagDto);
    }

}