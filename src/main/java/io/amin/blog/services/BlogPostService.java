package io.amin.blog.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.amin.blog.models.BlogPost;
import io.amin.blog.repositories.BlogPostRepository;

@Service
public class BlogPostService {
    
    @Autowired
    private BlogPostRepository blogPostRepository;


	public BlogPost getBlogPostById(int blogPostId) {
		return blogPostRepository.findById(blogPostId).orElseThrow();
	}

	public BlogPost addNewBlogPost(BlogPost blogPost) {
		return blogPostRepository.save(blogPost);
	}

	public BlogPost updateBlogPostDetails(int blogPostId, BlogPost blogPost) {
		return blogPostRepository.save(blogPost);
	}

	public BlogPost deleteBlogPostById(int blogPostId) {
		BlogPost blogPost = blogPostRepository.findById(blogPostId).orElseThrow();
		blogPostRepository.deleteById(blogPostId);
		return blogPost;
	}

	public List<BlogPost> getAllBlogPosts() {
		return blogPostRepository.findAll();
	}

	public List<BlogPost> getAllBlogPostsBetweenTimestamps(LocalDateTime timestampOne, LocalDateTime timestampTwo) {
		return blogPostRepository.findByTimestampBetween(timestampOne, timestampTwo);
	}
   
}