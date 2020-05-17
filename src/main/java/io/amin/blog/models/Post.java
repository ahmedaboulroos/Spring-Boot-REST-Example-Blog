package io.amin.blog.models;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "POSTS")
public class Post {

    @Id
    @GeneratedValue
    @Column(name = "POST_ID")
    private int id;

    @Column(name = "POST_TITLE")
    private String title;

    @Column(name = "POST_CONTENT")
    private String content;

    @Column(name = "POST_TIMESTAMP")
    private LocalDateTime timestamp;

    @ManyToMany
    private List<Tag> tags = new ArrayList<>();

    @ManyToOne
    private User author;

    @OneToMany(mappedBy = "post")
    private List<Comment> comments = new ArrayList<>();

}