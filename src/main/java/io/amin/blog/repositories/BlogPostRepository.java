package io.amin.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.amin.blog.models.BlogPost;

@Repository
public interface BlogPostRepository extends JpaRepository<BlogPost, Integer> {
    
    List<BlogPost> findByAuthorId(int blogPostId);

}