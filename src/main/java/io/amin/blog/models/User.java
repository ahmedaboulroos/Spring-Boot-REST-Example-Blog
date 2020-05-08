package io.amin.blog.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import io.amin.blog.models.utils.Address;
import io.amin.blog.models.utils.Image;
import io.amin.blog.models.utils.Name;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "USERS")
public class User {
    
    @Id
    @GeneratedValue
    @Column(name = "USER_ID")
    private int id;

    @OneToOne
    private Image profileImage;

    @Embedded
    private Name name;

    @Embedded
    private Address address;

    @Column(name = "USER_USERNAME", unique = true)
    private String username;

    @Column(name = "USER_PASSWORD")
    private String password;

    @Column(name = "USER_EMAIL", unique = true)
    private String email;

    @Column(name = "USER_PROFESSION")
    private String profession;

    @Column(name = "USER_BIO")
    private String bio;

    @Column(name = "ACCOUNT_ENABLED")
    private boolean accountEnabled;

    @Column(name = "ACCOUNT_LOCKED")
    private boolean accountLocked;

    @Column(name = "ACCOUNT_EXPIRED")
    private boolean accountExpired;

    @Column(name = "CREDENTIALS_EXPIRED")
    private boolean credentialsExpired;

    @ManyToMany
    private List<Role> roles;

    @OneToMany
    private List<BlogPost> blogPosts;
    
    @OneToMany
    private List<User> followings;

    @OneToMany
    private List<User> followers;

    @ManyToMany
    private List<Tag> interests;
    
}