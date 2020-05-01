package io.amin.blog.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import io.amin.blog.models.Blog;
import io.amin.blog.services.BlogService;

@Controller
@RequestMapping("/admin/blog")
public class BlogController {
    
    @Autowired
    private BlogService blogService;

    
    @GetMapping("/")
    public Blog getBlog() {
        return null;
    }

    @PutMapping("/")
    public Blog updateBlog(@RequestBody Blog blog) {
        return null;
    }
        
}