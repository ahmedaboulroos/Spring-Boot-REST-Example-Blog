package io.amin.blog.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
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
    @JoinTable(name = "POST_TAGS",
            joinColumns = {@JoinColumn(name = "POST_ID")},
            inverseJoinColumns = {@JoinColumn(name = "TAG_ID")})
    private List<Tag> tags = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "AUTHOR_ID")
    private User author;

    @OneToMany(mappedBy = "post")
    private List<Comment> comments = new ArrayList<>();

}