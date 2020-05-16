package io.amin.blog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.amin.blog.models.Blog;
import io.amin.blog.models.Tag;
import io.amin.blog.services.BlogService;
import io.amin.blog.services.TagService;

@RestController
@RequestMapping("/api/admin/blog/")
public class BlogController {
    
    @Autowired
    private BlogService blogService;
    @Autowired
    private TagService tagService;

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