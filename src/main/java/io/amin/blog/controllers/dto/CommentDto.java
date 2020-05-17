package io.amin.blog.controllers.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CommentDto {

    private int authorId;
    private int postId;
    private String content;
    private LocalDateTime timestamp;

}
