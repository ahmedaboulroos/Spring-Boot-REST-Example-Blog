package io.amin.blog.repositories;

import io.amin.blog.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

    List<Post> findByAuthorId(int postId);

    List<Post> findByTimestampBetween(LocalDateTime timestampOne, LocalDateTime timestampTwo);

    List<Post> findByTitleLike(String title);

}