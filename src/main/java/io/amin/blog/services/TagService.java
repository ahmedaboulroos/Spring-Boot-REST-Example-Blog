package io.amin.blog.services;

import io.amin.blog.models.Tag;
import io.amin.blog.repositories.TagRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService {

	private final TagRepository tagRepository;

	public TagService(TagRepository tagRepository) {
		this.tagRepository = tagRepository;
	}

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