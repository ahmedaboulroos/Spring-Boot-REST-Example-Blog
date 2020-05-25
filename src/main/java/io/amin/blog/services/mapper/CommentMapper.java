package io.amin.blog.services.mapper;

import io.amin.blog.exceptions.ResourceNotFoundException;
import io.amin.blog.models.Comment;
import io.amin.blog.repositories.PostRepository;
import io.amin.blog.repositories.UserRepository;
import io.amin.blog.services.dto.CommentDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CommentMapper {

    private final UserRepository userRepository;
    private final PostRepository postRepository;

    public CommentMapper(UserRepository userRepository, PostRepository postRepository) {
        this.userRepository = userRepository;
        this.postRepository = postRepository;
    }

    public CommentDto toDto(Comment comment) {
        CommentDto commentDto = new CommentDto();
        commentDto.setId(comment.getId());
        commentDto.setAuthorId(comment.getAuthor().getId());
        commentDto.setPostId(comment.getPost().getId());
        commentDto.setContent(comment.getContent());
        commentDto.setTimestamp(comment.getTimestamp());
        return commentDto;
    }

    public List<CommentDto> toDtoList(List<Comment> comments) {
        List<CommentDto> commentDtoList = new ArrayList<>();
        for (Comment comment : comments) {
            commentDtoList.add(toDto(comment));
        }
        return commentDtoList;
    }

    public Comment toModel(CommentDto commentDto) {
        Comment comment = new Comment();
        comment.setId(commentDto.getId());
        comment.setAuthor(userRepository.findById(commentDto.getAuthorId()).orElseThrow(() -> new ResourceNotFoundException("User with ID: " + commentDto.getAuthorId() + " Does not Exist.")));
        comment.setPost(postRepository.findById(commentDto.getPostId()).orElseThrow(() -> new ResourceNotFoundException("Post with ID: " + commentDto.getPostId() + " Does not Exist.")));
        comment.setContent(commentDto.getContent());
        comment.setTimestamp(commentDto.getTimestamp());
        return comment;
    }

}
