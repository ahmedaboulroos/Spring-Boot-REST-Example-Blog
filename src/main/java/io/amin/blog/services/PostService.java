package io.amin.blog.services;

import io.amin.blog.models.Post;
import io.amin.blog.repositories.PostRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post getBlogPostById(int blogPostId) {
        return postRepository.findById(blogPostId).orElseThrow();
    }

    public Post addNewBlogPost(Post post) {
        return postRepository.save(post);
    }

    public Post updateBlogPostDetails(int blogPostId, Post post) {
        return postRepository.save(post);
    }

    public Post deleteBlogPostById(int blogPostId) {
        Post post = postRepository.findById(blogPostId).orElseThrow();
        postRepository.deleteById(blogPostId);
        return post;
    }

    public List<Post> getAllBlogPosts() {
        return postRepository.findAll();
    }

    public List<Post> getAllBlogPostsBetweenTimestamps(LocalDateTime timestampOne, LocalDateTime timestampTwo) {
        return postRepository.findByTimestampBetween(timestampOne, timestampTwo);
    }

}