package io.amin.blog.services.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PostDto {

    private int id;
    private int authorId;
    private String title;
    private String content;
    private LocalDateTime timestamp;

}
