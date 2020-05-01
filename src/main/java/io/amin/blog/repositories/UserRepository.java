package io.amin.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.amin.blog.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    
}