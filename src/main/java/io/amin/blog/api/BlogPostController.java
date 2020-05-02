package io.amin.blog.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import io.amin.blog.models.BlogPost;
import io.amin.blog.models.Comment;
import io.amin.blog.services.BlogPostService;
import io.amin.blog.services.CommentService;
import io.amin.blog.services.ImageService;
import io.amin.blog.services.TagService;

@Controller
@RequestMapping("/api")
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
    public List<BlogPost> getAllBlogPosts(@RequestParam String tag) {
        return null;
    }

    @GetMapping("/blogs/{blogPostId}")
    public BlogPost getBlogPost(@PathVariable int blogPostId) {
        return blogPostService.getBlogPostById(blogPostId);
    }
    
    @PostMapping("/blogs/")
    public BlogPost createBlogPost(@RequestBody BlogPost blogPost) {
        return blogPostService.addNewBlogPost(blogPost);
    }

    @PutMapping("/blogs/{blogPostId}")
    public BlogPost updateBlogPost(@PathVariable int blogPostId, @RequestBody BlogPost blogPost) {
        return blogPostService.updateBlogPostDetails(blogPostId, blogPost);
    }
    
    @DeleteMapping("/blogs/{blogPostId}")
    public BlogPost deleteBlogPost(@PathVariable int blogPostId) {
        return blogPostService.deleteBlogPostById(blogPostId);
    }



    @GetMapping("/blogs/{blogPostId}/comments/")
    public List<Comment> getBlogPostComments(@PathVariable int blogPostId) {
        return commentService.getBlogPostComments(blogPostId);
    }

    @GetMapping("/blogs/{blogPostId}/comments/{commentId}")
    public Comment getBlogPostComment(@PathVariable int blogPostId, @PathVariable int commentId) {
        return commentService.getBlogPostComment(blogPostId, commentId);
    }
    
    @PostMapping("/blogs/{blogPostId}/comments/")
    public Comment createBlogPostComment(@PathVariable int blogPostId, @RequestBody Comment comment) {
        return commentService.createBlogPostComment(blogPostId, comment);
    }

    @PutMapping("/blogs/{blogPostId}/comments/{commentId}")
    public Comment updateBlogPostComment(@PathVariable int blogPostId, @PathVariable int commentId, @RequestBody Comment comment) {
        return commentService.updateBlogPostComment(blogPostId, commentId, comment);
    }
    
    @DeleteMapping("/blogs/{blogPostId}/comments/{commentId}")
    public Comment deleteBlogPostComment(@PathVariable int blogPostId, @PathVariable int commentId) {
        return commentService.deleteBlogPostComment(blogPostId, commentId);
    }

}