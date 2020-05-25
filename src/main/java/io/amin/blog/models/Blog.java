package io.amin.blog.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "BLOG")
public class Blog {
    
    @Id
    @GeneratedValue
    @Column(name = "BLOG_ID")
    private int id;

    @Column(name = "BLOG_NAME")
    private String name;

    @Column(name = "BLOG_DESCRIPTION")
    private String description;

}