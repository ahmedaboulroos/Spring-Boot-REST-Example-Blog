package io.amin.blog.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import io.amin.blog.models.Blog;
import io.amin.blog.services.BlogService;

@Controller
@RequestMapping("/api/admin/blog")
public class BlogController {
    
    @Autowired
    private BlogService blogService;

    
    @GetMapping("/")
    public Blog getBlog() {
        return blogService.getBlogDetails();
    }

    @PutMapping("/")
    public Blog updateBlog(@RequestBody Blog blog) {
        return blogService.updateBlogDetails(blog);
    }
        
}