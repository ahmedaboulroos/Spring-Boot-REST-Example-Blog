package io.amin.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.amin.blog.models.Blog;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {
    
}