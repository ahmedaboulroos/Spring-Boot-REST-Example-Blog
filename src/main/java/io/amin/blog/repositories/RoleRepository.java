package io.amin.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.amin.blog.models.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    
}