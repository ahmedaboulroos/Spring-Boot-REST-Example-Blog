package io.amin.blog.services.impl;

import io.amin.blog.exceptions.ResourceNotFoundException;
import io.amin.blog.repositories.PostRepository;
import io.amin.blog.services.PostService;
import io.amin.blog.services.dto.PostDto;
import io.amin.blog.services.mapper.PostMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;
    private final PostMapper postMapper;

    public PostServiceImpl(PostRepository postRepository, PostMapper postMapper) {
        this.postRepository = postRepository;
        this.postMapper = postMapper;
    }

    public PostDto getPostById(int postId) {
        return postMapper.toDto(postRepository.findById(postId).orElseThrow(() -> new ResourceNotFoundException("Post with Id: " + postId + " Does not Exist.")));
    }

    public PostDto createPost(PostDto postDto) {
        return postMapper.toDto(postRepository.save(postMapper.toModel(postDto)));
    }

    public PostDto updatePost(int postId, PostDto postDto) {
        return postMapper.toDto(postRepository.save(postMapper.toModel(postDto)));
    }

    public void deletePostById(int postId) {
        postRepository.deleteById(postId);
    }

    public List<PostDto> getPosts() {
        return postMapper.toDtoList(postRepository.findAll());
    }

    @Override
    public List<PostDto> getPostsByUserId(int userId) {
        return postMapper.toDtoList(postRepository.findByAuthorId(userId));
    }

    public List<PostDto> getPostsBetweenTimestamps(LocalDateTime timestampOne, LocalDateTime timestampTwo) {
        return postMapper.toDtoList(postRepository.findByTimestampBetween(timestampOne, timestampTwo));
    }

}