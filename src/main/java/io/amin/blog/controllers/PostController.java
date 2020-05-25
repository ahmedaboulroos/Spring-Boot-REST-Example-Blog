package io.amin.blog.controllers;

import io.amin.blog.services.PostService;
import io.amin.blog.services.dto.PostDto;
import io.amin.blog.services.dto.TagDto;
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
    public List<PostDto> getAllPosts(@RequestParam(required = false) String tag) {
        return postService.getPosts();
    }

    @GetMapping("/posts/{postId}")
    public PostDto getPostById(@PathVariable int postId) {
        return postService.getPostById(postId);
    }

    @PostMapping("/posts")
    public PostDto createNewPost(@RequestBody PostDto postDto) {
        return postService.createPost(postDto);
    }

    @PutMapping("/posts/{postId}")
    public PostDto updateExistingPost(@PathVariable int postId, @RequestBody PostDto postDto) {
        return postService.updatePost(postId, postDto);
    }

    @DeleteMapping("/posts/{postId}")
    public void deleteExistingPostById(@PathVariable int postId) {
        postService.deletePostById(postId);
    }


    @GetMapping("/posts/{postId}/tags")
    public List<TagDto> getAllPostTags(@PathVariable int postId) {
        return null;
    }

    @PostMapping("/posts/{postId}/tags")
    public TagDto addTagToPost(@PathVariable int postId, @RequestBody TagDto tagDto) {
        return null;
    }

    @DeleteMapping("/posts/{postId}/tags/{tagId}")
    public TagDto removeTagFromPost(@PathVariable int postId, @PathVariable int tagId) {
        return null;
    }

}