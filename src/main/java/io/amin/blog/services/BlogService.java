package io.amin.blog.services;

import io.amin.blog.models.Blog;
import io.amin.blog.repositories.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {

    private final BlogRepository blogRepository;
    private final UserService userService;

    public BlogService(BlogRepository blogRepository, UserService userService) {
        this.blogRepository = blogRepository;
        this.userService = userService;
    }

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