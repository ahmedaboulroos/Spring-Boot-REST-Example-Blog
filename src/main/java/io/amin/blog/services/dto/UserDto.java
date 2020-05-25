package io.amin.blog.services.dto;

import lombok.Data;

@Data
public class UserDto {

    private int id;
    private String username;
    private String password;
    private String email;

    private String firstName;
    private String middleName;
    private String lastName;
    private String nickname;
    private String title;
    private String Street;
    private String city;
    private String zipCode;
    private String country;
    private String profession;
    private String bio;

}
