package io.amin.blog.services;

import io.amin.blog.services.dto.BlogDto;

public interface BlogService {

    BlogDto getBlogDetails();

    BlogDto updateBlogDetails(BlogDto blogDto);

}
