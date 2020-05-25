package io.amin.blog.controllers;

import io.amin.blog.services.BlogService;
import io.amin.blog.services.dto.BlogDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BlogController {

    private final BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping("/blog")
    public BlogDto getBlogDetails() {
        return blogService.getBlogDetails();
    }

    @PutMapping("/blog")
    public BlogDto updateBlogDetails(@RequestBody BlogDto blogDto) {
        return blogService.updateBlogDetails(blogDto);
    }

}