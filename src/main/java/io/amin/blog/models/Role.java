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
@Table(name = "ROLES")
public class Role {
    
    @Id
    @GeneratedValue
    @Column(name = "ROLE_ID")
    private int id;

    @Column(name = "ROLE_NAME")
    private String name;

    @Column(name = "ROLE_DESCRIPTION")
    private String Description;

    @ManyToMany
    private List<User> users;
    
}