package io.amin.blog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.amin.blog.models.BlogPost;
import io.amin.blog.repositories.BlogPostRepository;

@Service
public class BlogPostService {
    
    @Autowired
    private BlogPostRepository blogPostRepository;


    
	public BlogPost getBlogPostById(int blogPostId) {
		return null;
	}

	public BlogPost addNewBlogPost(BlogPost blogPost) {
		return null;
	}

	public BlogPost updateBlogPostDetails(int blogPostId, BlogPost blogPost) {
		return null;
	}

	public BlogPost deleteBlogPostById(int blogPostId) {
		return null;
	}

    
}