package io.amin.blog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.amin.blog.repositories.BlogPostRepository;

@Service
public class BlogPostService {
    
    @Autowired
    private BlogPostRepository blogPostRepository;

    
}