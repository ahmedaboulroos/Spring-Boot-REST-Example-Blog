package io.amin.blog.models;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "TAGS")
public class Tag {

    @Id
    @GeneratedValue
    @Column(name = "TAG_ID")
    private int id;

    @Column(name = "TAG_NAME")
    private String name;

    @Column(name = "TAG_DESCRIPTION")
    private String description;

    @ManyToMany
    private List<Post> posts = new ArrayList<>();

}