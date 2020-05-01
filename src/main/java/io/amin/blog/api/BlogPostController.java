package io.amin.blog.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import io.amin.blog.models.BlogPost;
import io.amin.blog.services.BlogPostService;
import io.amin.blog.services.CommentService;
import io.amin.blog.services.ImageService;
import io.amin.blog.services.TagService;

@Controller
public class BlogPostController {
    
    @Autowired
    private BlogPostService blogPostService;
    @Autowired
    private CommentService commentService;
    @Autowired
    private ImageService imageService;
    @Autowired
    private TagService tagService;

    
    @GetMapping("/blogs/")
    public BlogPost getAllBlogPosts(@RequestParam String tag) {
        return null;
    }

    @GetMapping("/blogs/{id}")
    public BlogPost getBlogPost(@PathVariable int id) {
        return null;
    }
    
    @PostMapping("/blogs/")
    public BlogPost createBlogPost(@RequestBody BlogPost blogPost) {
        return null;
    }

    @PutMapping("/blogs/{id}")
    public BlogPost updateBlogPost(@PathVariable int id, @RequestBody BlogPost blogPost) {
        return null;
    }
    
    @DeleteMapping("/blogs/{id}")
    public BlogPost deleteBlogPost(@PathVariable int id) {
        return null;
    }
    


    @GetMapping("/blogs/{bid}/comments/")
    public BlogPost getBlogPostComments(@PathVariable int bid) {
        return null;
    }

    @GetMapping("/blogs/{bid}/comments/{cid}")
    public BlogPost getBlogPostComment(@PathVariable int id) {
        return null;
    }
    
    @PostMapping("/blogs/{bid}/comments/")
    public BlogPost createBlogPostComment(@RequestBody BlogPost blogPost) {
        return null;
    }

    @PutMapping("/blogs/{bid}/comments/{cid}")
    public BlogPost updateBlogPostComment(@PathVariable int id, @RequestBody BlogPost blogPost) {
        return null;
    }
    
    @DeleteMapping("/blogs/{bid}/comments/{cid}")
    public BlogPost deleteBlogPostComment(@PathVariable int id) {
        return null;
    }

}