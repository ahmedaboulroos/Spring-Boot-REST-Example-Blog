package io.amin.blog.services.mapper;

import io.amin.blog.models.Blog;
import io.amin.blog.services.dto.BlogDto;
import org.springframework.stereotype.Component;

@Component
public class BlogMapper {

    public BlogDto toDto(Blog blog) {
        BlogDto blogDto = new BlogDto();
        blogDto.setId(blog.getId());
        blogDto.setName(blog.getName());
        blogDto.setDescription(blog.getDescription());
        return blogDto;
    }

    public Blog toModel(BlogDto blogDto) {
        Blog blog = new Blog();
        blog.setId(blogDto.getId());
        blog.setName(blogDto.getName());
        blog.setDescription(blogDto.getDescription());
        return blog;
    }

}
