package io.amin.blog.services.mapper;

import io.amin.blog.models.Tag;
import io.amin.blog.services.dto.TagDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TagMapper {

    public TagDto toDto(Tag tag) {
        TagDto tagDto = new TagDto();
        tagDto.setId(tag.getId());
        tagDto.setName(tag.getName());
        tagDto.setDescription(tag.getDescription());
        return tagDto;
    }

    public List<TagDto> toDtoList(List<Tag> tags) {
        List<TagDto> tagDtoList = new ArrayList<>();
        for (Tag tag : tags) {
            tagDtoList.add(toDto(tag));
        }
        return tagDtoList;
    }

    public Tag toModel(TagDto tagDto) {
        Tag tag = new Tag();
        tag.setId(tagDto.getId());
        tag.setName(tagDto.getName());
        tag.setDescription(tagDto.getDescription());
        return tag;
    }

}
