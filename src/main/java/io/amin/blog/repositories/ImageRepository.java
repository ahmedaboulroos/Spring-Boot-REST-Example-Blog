package io.amin.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.amin.blog.models.utils.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image, Integer> {
    
}