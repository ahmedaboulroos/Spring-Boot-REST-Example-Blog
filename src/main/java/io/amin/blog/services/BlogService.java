package io.amin.blog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.amin.blog.models.Blog;
import io.amin.blog.repositories.BlogRepository;

@Service
public class BlogService {
    
    @Autowired
    private BlogRepository blogRepository;
    @Autowired
    private UserService userService;

	public Blog getBlogDetails() {
        Blog blog = null;
        List<Blog> blogs = blogRepository.findAll();
        
        if (blogs.size() != 1) {
            blogRepository.deleteAll();
            blog = createBlogForFirstTime();
        } else {
            blog = blogs.get(0);
        }
        
        return blog;
	}

	public Blog updateBlogDetails(Blog blog) {
		return blogRepository.save(blog);
	}

    private Blog createBlogForFirstTime() {
        Blog blog = new Blog();
        blog.setName("Blog Default Name");
        blog.setDescription("Blog Default Description");
        return blog;
    }

}