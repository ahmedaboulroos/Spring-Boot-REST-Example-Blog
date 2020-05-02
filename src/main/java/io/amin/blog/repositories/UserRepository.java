package io.amin.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.amin.blog.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    
    List<User> findByNameFirstNameOrNameLastNameIgnoreCaseLike(String name);

    User findByUsernameAndPassword(String username, String password);

    User findByEmailAndPassword(String email, String password);

    User findByIsAdminTrue();

}