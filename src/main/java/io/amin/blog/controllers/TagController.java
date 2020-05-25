package io.amin.blog.controllers;

import io.amin.blog.services.TagService;
import io.amin.blog.services.dto.TagDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TagController {

    private final TagService tagService;

    public TagController(TagService tagService) {
        this.tagService = tagService;
    }

    @GetMapping("tags")
    public List<TagDto> getAllTags() {
        return tagService.getTags();
    }

    @GetMapping("tags/{tagId}")
    public TagDto getTagById(@PathVariable int tagId) {
        return tagService.getTagById(tagId);
    }

    @PostMapping("tags")
    public TagDto createNewTag(@RequestBody TagDto tagDto) {
        return tagService.createTag(tagDto);
    }

    @PutMapping("tags/{tagId}")
    public TagDto updateExistingTag(@PathVariable int tagId, @RequestBody TagDto tagDto) {
        return tagService.updateTag(tagId, tagDto);
    }

    @DeleteMapping("tags/{tagId}")
    public void deleteExistingTagById(@PathVariable int tagId) {
        tagService.deleteTagById(tagId);
    }

}
