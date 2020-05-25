package io.amin.blog.services.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CommentDto {

    private int id;
    private int authorId;
    private int postId;
    private String content;
    private LocalDateTime timestamp;

}
