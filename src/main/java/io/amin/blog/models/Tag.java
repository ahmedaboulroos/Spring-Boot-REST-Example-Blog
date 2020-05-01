package io.amin.blog.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "TAGS")
public class Tag {
    
    @Id
    @GeneratedValue
    @Column(name = "TAG_ID")
    private int id;

    @Column(name = "TAG_NAME")
    private String name;

    @ManyToMany
    private List<BlogPost> blogPosts;

}