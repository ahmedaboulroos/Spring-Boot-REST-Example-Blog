package io.amin.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.amin.blog.models.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
    
    List<Comment> findByBlogPostId(int blogPostId);

    List<Comment> findByAuthorId(int authorId);

}