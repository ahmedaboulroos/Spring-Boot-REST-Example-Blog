package io.amin.blog.controllers.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PostDto {

    private int authorId;
    private String title;
    private String content;
    private LocalDateTime timestamp;

}
