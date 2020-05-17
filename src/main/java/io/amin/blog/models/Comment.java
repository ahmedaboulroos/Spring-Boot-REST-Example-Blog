package io.amin.blog.models;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "COMMENTS")
public class Comment {
    
    @Id
    @GeneratedValue
    @Column(name = "COMMENT_ID")
    private int id;

    @ManyToOne
    private User author;

    @ManyToOne
    private Post post;

    @Column(name = "COMMENT_CONTENT")
    private String content;

    @Column(name = "COMMENT_TIMESTAMP")
    private LocalDateTime timestamp;

}