package io.amin.blog.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
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
    private BlogPost blogPost;

    @Column(name = "COMMENT_CONTENT")
    private String content;

    @Column(name = "COMMENT_TIMESTAMP")
    private LocalDateTime timestamp;

}