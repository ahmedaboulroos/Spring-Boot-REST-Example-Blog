package io.amin.blog.models;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "USER_ID")
    private int id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "MIDDLE_NAME")
    private String middleName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "NICK_NAME")
    private String nickname;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "ADDRESS_STREET")
    private String Street;

    @Column(name = "ADDRESS_CITY")
    private String city;

    @Column(name = "ADDRESS_ZIP_CODE")
    private String zipCode;

    @Column(name = "ADDRESS_COUNTRY")
    private String country;

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

    @OneToMany(mappedBy = "author")
    private List<Post> posts = new ArrayList<>();

    @OneToMany
    private List<User> followings = new ArrayList<>();

    @OneToMany
    private List<User> followers = new ArrayList<>();

    @ManyToMany
    private List<Tag> interests = new ArrayList<>();

    public User() {

    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.accountEnabled = true;
        this.accountLocked = false;
        this.accountExpired = false;
        this.credentialsExpired = false;
    }

}