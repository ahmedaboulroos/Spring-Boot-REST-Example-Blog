package io.amin.blog.controllers;

import io.amin.blog.services.CommentService;
import io.amin.blog.services.dto.CommentDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CommentController {

    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/comments")
    public List<CommentDto> getAllComments(@RequestParam(required = false) Integer postId, @RequestParam(required = false) Integer userId) {
        if (postId == null && userId == null) {
            return commentService.getAllComments();
        } else if (postId == null) {
            return commentService.getUserComments(userId);
        }
        return commentService.getPostComments(postId);
    }

    @GetMapping("/comments/{commentId}")
    public CommentDto getCommentById(@PathVariable int commentId) {
        return commentService.getCommentById(commentId);
    }

    @PostMapping("/comments")
    public CommentDto createNewComment(@RequestBody CommentDto commentDto) {
        return commentService.createComment(commentDto);
    }

    @PutMapping("/comments/{commentId}")
    public CommentDto updateExistingComment(@PathVariable int commentId, @RequestBody CommentDto commentDto) {
        return commentService.updateComment(commentDto);
    }

    @DeleteMapping("/comments/{commentId}")
    public void deleteCommentById(@PathVariable int commentId) {
        commentService.deleteCommentById(commentId);
    }

}
