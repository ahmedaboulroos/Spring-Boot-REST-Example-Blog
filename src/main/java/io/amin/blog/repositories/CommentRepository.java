package io.amin.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.amin.blog.models.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
    
}