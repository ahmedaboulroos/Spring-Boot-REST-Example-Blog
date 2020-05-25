package io.amin.blog.services.impl;

import io.amin.blog.models.Blog;
import io.amin.blog.repositories.BlogRepository;
import io.amin.blog.services.BlogService;
import io.amin.blog.services.dto.BlogDto;
import io.amin.blog.services.mapper.BlogMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    private final BlogRepository blogRepository;
    private final BlogMapper blogMapper;

    public BlogServiceImpl(BlogRepository blogRepository, BlogMapper blogMapper) {
        this.blogRepository = blogRepository;
        this.blogMapper = blogMapper;
    }

    public BlogDto getBlogDetails() {
        BlogDto blog = null;
        List<Blog> blogs = blogRepository.findAll();
        if (blogs.size() != 1) {
            blogRepository.deleteAll();
            blog = createBlogForFirstTime();
            blog = blogMapper.toDto(blogRepository.save(blogMapper.toModel(blog)));
        } else {
            blog = blogMapper.toDto(blogs.get(0));
        }
        return blog;
    }

    public BlogDto updateBlogDetails(BlogDto blogDto) {
        return blogMapper.toDto(blogRepository.save(blogMapper.toModel(blogDto)));
    }

    private BlogDto createBlogForFirstTime() {
        BlogDto blogDto = new BlogDto();
        blogDto.setName("Blog Default Name");
        blogDto.setDescription("Blog Default Description");
        return blogDto;
    }

}