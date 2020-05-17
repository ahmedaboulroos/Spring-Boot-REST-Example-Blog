package io.amin.blog.models;

import lombok.Data;

import javax.persistence.*;

@Data
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

    @OneToOne
    private User admin;

}