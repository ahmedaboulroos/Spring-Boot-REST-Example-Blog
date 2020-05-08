package io.amin.blog.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.accountEnabled = true;
        this.accountLocked = false;
        this.accountExpired = false;
        this.credentialsExpired = false;
	}

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

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Role> roles = new ArrayList<>();

    @OneToMany
    private List<BlogPost> blogPosts = new ArrayList<>();
    
    @OneToMany
    private List<User> followings = new ArrayList<>();

    @OneToMany
    private List<User> followers = new ArrayList<>();

    @ManyToMany
    private List<Tag> interests = new ArrayList<>();
    
}