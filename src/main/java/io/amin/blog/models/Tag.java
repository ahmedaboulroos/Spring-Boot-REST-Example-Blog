package io.amin.blog.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
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

    @ManyToMany(mappedBy = "tags")
    private List<Post> posts = new ArrayList<>();

    @ManyToMany(mappedBy = "interests")
    private List<User> interestedUsers = new ArrayList<>();

    public Tag() {

    }

    public Tag(String name, String description) {
        this.name = name;
        this.description = description;
    }

}