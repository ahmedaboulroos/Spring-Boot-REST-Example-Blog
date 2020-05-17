package io.amin.blog.controllers;

import io.amin.blog.controllers.dto.PostDto;
import io.amin.blog.models.Post;
import io.amin.blog.models.Tag;
import io.amin.blog.services.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public List<Post> readAllPosts(@RequestParam(required = false) String tag) {
        return postService.getAllBlogPosts();
    }

    @GetMapping("/posts/{postId}")
    public Post readPostById(@PathVariable int postId) {
        return postService.getBlogPostById(postId);
    }

    @PostMapping("/posts")
    public Post addNewPost(@RequestBody PostDto postDto) {
        return null;
    }

    @PutMapping("/posts/{postId}")
    public Post updateExistingPost(@PathVariable int postId, @RequestBody PostDto postDto) {
        return null;
    }

    @DeleteMapping("/posts/{postId}")
    public Post deleteExistingPost(@PathVariable int postId) {
        return postService.deleteBlogPostById(postId);
    }


    @GetMapping("/posts/{postId}/tags")
    public Post readAllPostTags(@PathVariable int postId) {
        return postService.getBlogPostById(postId);
    }

    @PostMapping("/posts/{postId}/tags")
    public Post addNewTagToPost(@PathVariable int postId, @RequestBody Tag tag) {
        return postService.getBlogPostById(postId);
    }

    @DeleteMapping("/posts/{postId}/tags/{tagId}")
    public Post removeTagFromPost(@PathVariable int postId, @PathVariable int tagId) {
        return postService.getBlogPostById(postId);
    }

}