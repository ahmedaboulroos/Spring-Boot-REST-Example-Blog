package io.amin.blog.services;

import io.amin.blog.services.dto.TagDto;

import java.util.List;

public interface TagService {

    List<TagDto> getTags();

    TagDto getTagById(int tagId);

    TagDto createTag(TagDto tagDto);

    TagDto updateTag(int tagId, TagDto tagDto);

    void deleteTagById(int tagId);

}
