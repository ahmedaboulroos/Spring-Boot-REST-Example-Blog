package io.amin.blog.models.utils;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Name {
    
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
    
}