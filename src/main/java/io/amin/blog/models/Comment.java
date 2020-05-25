package io.amin.blog.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "COMMENTS")
public class Comment {
    
    @Id
    @GeneratedValue
    @Column(name = "COMMENT_ID")
    private int id;

    @Column(name = "COMMENT_CONTENT")
    private String content;

    @Column(name = "COMMENT_TIMESTAMP")
    private LocalDateTime timestamp;

    @ManyToOne
    @JoinColumn(name = "AUTHOR_ID")
    private User author;

    @ManyToOne
    @JoinColumn(name = "POST_ID")
    private Post post;

}