package io.amin.blog.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "ROLES")
public class Role {
    
	@Id
    @GeneratedValue
    @Column(name = "ROLE_ID")
    private int id;

    @Column(name = "ROLE_NAME")
    private String name;

    @Column(name = "ROLE_DESCRIPTION")
    private String description;

    @ManyToMany(mappedBy = "roles")
    private List<User> users = new ArrayList<>();

    public Role() {

    }

    public Role(String name) {
        this.name = name;
    }

    public Role(String name, String description) {
        this.name = name;
        this.description = description;
    }

}