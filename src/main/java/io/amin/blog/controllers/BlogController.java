package io.amin.blog.controllers;

import io.amin.blog.models.Blog;
import io.amin.blog.models.Tag;
import io.amin.blog.services.BlogService;
import io.amin.blog.services.TagService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/blog/")
public class BlogController {

    private final BlogService blogService;
    private final TagService tagService;

    public BlogController(BlogService blogService, TagService tagService) {
        this.blogService = blogService;
        this.tagService = tagService;
    }

    @GetMapping("details")
    public Blog getBlog() {
        return blogService.getBlogDetails();
    }

    @PutMapping("details")
    public Blog updateBlog(@RequestBody Blog blog) {
        return blogService.updateBlogDetails(blog);
    }
    
    @GetMapping("tags")
    public List<Tag> getAllTags() {
        return tagService.getAllTags();
    }

    @GetMapping("tags/{tagId}")
    public Tag getTagById(@PathVariable int tagId) {
        return tagService.getTagById(tagId);
    }

    @PostMapping("tags")
    public Tag createTag(@RequestBody Tag tag) {
        return tagService.createNewTag(tag);
    }
    
    @PutMapping("tags/{tagId}")
    public Tag updateTag(@PathVariable int tagId, @RequestBody Tag tag) {
        return tagService.updateTagDetails(tagId, tag);
    }
    
    @DeleteMapping("tags/{tagId}")
    public Tag deleteTag(@PathVariable int tagId) {
        return tagService.deleteTagById(tagId);
    }

}