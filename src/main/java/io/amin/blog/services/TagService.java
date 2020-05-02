package io.amin.blog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.amin.blog.models.Tag;
import io.amin.blog.repositories.TagRepository;

@Service
public class TagService {
    
    @Autowired
    private TagRepository tagRepository;

	public List<Tag> getAllTags() {
		return tagRepository.findAll();
	}

	public Tag getTagById(int tagId) {
		return tagRepository.findById(tagId).orElseThrow();
	}

	public Tag createNewTag(Tag tag) {
		return tagRepository.save(tag);
	}

	public Tag updateTagDetails(int tagId, Tag tag) {
        if(tag.getId() != tagId) {
            // TODO throw an error
        }
		return tagRepository.save(tag);
	}

	public Tag deleteTagById(int tagId) {
        Tag tag = tagRepository.findById(tagId).orElseThrow();
        tagRepository.deleteById(tagId);
		return tag;
	}

}