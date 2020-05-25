package io.amin.blog.services;

import io.amin.blog.services.dto.PostDto;

import java.time.LocalDateTime;
import java.util.List;

public interface PostService {

    PostDto getPostById(int postId);

    void deletePostById(int postId);

    PostDto createPost(PostDto postDto);

    PostDto updatePost(int postId, PostDto postDto);

    List<PostDto> getPosts();

    List<PostDto> getPostsByUserId(int userId);

    List<PostDto> getPostsBetweenTimestamps(LocalDateTime timestampOne, LocalDateTime timestampTwo);

}
