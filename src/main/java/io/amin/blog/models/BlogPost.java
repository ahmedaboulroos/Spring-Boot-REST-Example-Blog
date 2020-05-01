package io.amin.blog.models;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import io.amin.blog.models.utils.Image;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@Entity
@Table(name = "BLOG_POSTS")
public class BlogPost {
    
    @Id
    @GeneratedValue
    @Column(name = "BLOG_POST_ID")
    private int id;

    @Column(name = "BLOG_POST_TITLE")
    private String title;
    
    @Column(name = "BLOG_POST_CONTENT")
    private String content;
    
    @Column(name = "BLOG_POST_TIMESTAMP")
    private LocalDateTime timestamp;

    @OneToOne
    private Image blogPostImage;

    @ManyToMany
    private List<Tag> tags;

    @ManyToOne
    private User author;

    @OneToMany
    private List<Comment> comments;

}