package io.amin.blog.services;

import io.amin.blog.services.dto.CommentDto;

import java.util.List;

public interface CommentService {

    List<CommentDto> getAllComments();

    List<CommentDto> getPostComments(Integer postId);

    List<CommentDto> getUserComments(Integer userId);

    CommentDto getCommentById(Integer commentId);

    CommentDto updateComment(CommentDto commentDto);

    CommentDto createComment(CommentDto commentDto);

    void deleteCommentById(Integer commentId);

}
