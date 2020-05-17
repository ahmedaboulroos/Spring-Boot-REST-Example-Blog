package io.amin.blog.controllers;

import io.amin.blog.controllers.dto.CommentDto;
import io.amin.blog.models.Comment;
import io.amin.blog.services.CommentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class CommentController {

    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/comments")
    public List<Comment> getBlogPostComments(@RequestParam(required = false) int postId, @RequestParam(required = false) int userId) {
        return null;
    }

    @GetMapping("/comments/{commentId}")
    public Comment getBlogPostComment(@PathVariable int commentId) {
        return null;
    }

    @PostMapping("/comments")
    public Comment createBlogPostComment(@RequestBody CommentDto commentDto) {
        return null;
    }

    @PutMapping("/comments/{commentId}")
    public Comment updateBlogPostComment(@PathVariable int commentId, @RequestBody CommentDto commentDto) {
        return null;
    }

    @DeleteMapping("/comments/{commentId}")
    public Comment deleteBlogPostComment(@PathVariable int commentId) {
        return null;
    }

}
