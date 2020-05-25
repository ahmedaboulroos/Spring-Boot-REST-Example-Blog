package io.amin.blog.services.impl;

import io.amin.blog.repositories.CommentRepository;
import io.amin.blog.services.CommentService;
import io.amin.blog.services.dto.CommentDto;
import io.amin.blog.services.mapper.CommentMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;
    private final CommentMapper commentMapper;

    public CommentServiceImpl(CommentRepository commentRepository, CommentMapper commentMapper) {
        this.commentRepository = commentRepository;
        this.commentMapper = commentMapper;
    }

    @Override
    public List<CommentDto> getAllComments() {
        return commentMapper.toDtoList(commentRepository.findAll());
    }

    public List<CommentDto> getPostComments(Integer postId) {
        return commentMapper.toDtoList(commentRepository.findByPostId(postId));
    }

    public List<CommentDto> getUserComments(Integer userId) {
        return commentMapper.toDtoList(commentRepository.findByAuthorId(userId));
    }

    public CommentDto getCommentById(Integer commentId) {
        return commentMapper.toDto(commentRepository.findById(commentId).orElseThrow());
    }

    public CommentDto updateComment(CommentDto commentDto) {
        return commentMapper.toDto(commentRepository.save(commentMapper.toModel(commentDto)));
    }

    public CommentDto createComment(CommentDto commentDto) {
        return commentMapper.toDto(commentRepository.save(commentMapper.toModel(commentDto)));
    }

    public void deleteCommentById(Integer commentId) {
        commentRepository.deleteById(commentId);
    }

}