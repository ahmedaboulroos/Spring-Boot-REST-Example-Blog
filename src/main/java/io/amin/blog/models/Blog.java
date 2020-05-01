package io.amin.blog.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
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