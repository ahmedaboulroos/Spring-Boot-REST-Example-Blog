package io.amin.blog.services.impl;

import io.amin.blog.exceptions.ResourceNotFoundException;
import io.amin.blog.exceptions.ResourcePathAndBodyMismatchException;
import io.amin.blog.repositories.TagRepository;
import io.amin.blog.services.TagService;
import io.amin.blog.services.dto.TagDto;
import io.amin.blog.services.mapper.TagMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImpl implements TagService {

    private final TagRepository tagRepository;
    private final TagMapper tagMapper;

    public TagServiceImpl(TagRepository tagRepository, TagMapper tagMapper) {
        this.tagRepository = tagRepository;
        this.tagMapper = tagMapper;
    }

    public List<TagDto> getTags() {
        return tagMapper.toDtoList(tagRepository.findAll());
    }

    public TagDto getTagById(int tagId) {
        return tagMapper.toDto(tagRepository.findById(tagId).orElseThrow(() -> new ResourceNotFoundException("Tag with Id: " + tagId + " Does not Exist.")));
    }

    public TagDto createTag(TagDto tagDto) {
        return tagMapper.toDto(tagRepository.save(tagMapper.toModel(tagDto)));
    }

    public TagDto updateTag(int tagId, TagDto tagDto) {
        if (tagDto.getId() != tagId)
            throw new ResourcePathAndBodyMismatchException("Tag IDs Does not match (tagId != tag.id)");
        tagRepository.findById(tagId).orElseThrow(() -> new ResourceNotFoundException("Tag with Id: " + tagId + " Does not Exist."));
        return tagMapper.toDto(tagRepository.save(tagMapper.toModel(tagDto)));
    }

    public void deleteTagById(int tagId) {
        tagRepository.deleteById(tagId);
    }

}