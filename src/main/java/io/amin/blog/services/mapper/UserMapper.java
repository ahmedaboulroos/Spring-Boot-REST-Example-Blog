package io.amin.blog.services.mapper;

import io.amin.blog.models.User;
import io.amin.blog.services.dto.UserDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserMapper {

    public UserDto toDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setUsername(user.getUsername());
        userDto.setPassword(user.getPassword());
        userDto.setEmail(user.getEmail());
        userDto.setFirstName(user.getFirstName());
        userDto.setMiddleName(user.getMiddleName());
        userDto.setLastName(user.getLastName());
        userDto.setNickname(user.getNickname());
        userDto.setTitle(user.getTitle());
        userDto.setStreet(user.getStreet());
        userDto.setCity(user.getCity());
        userDto.setZipCode(user.getZipCode());
        userDto.setCountry(user.getCountry());
        userDto.setProfession(user.getProfession());
        userDto.setBio(user.getBio());
        return userDto;
    }

    public List<UserDto> toDtoList(List<User> users) {
        List<UserDto> userDtoList = new ArrayList<>();
        for (User user : users) {
            userDtoList.add(toDto(user));
        }
        return userDtoList;
    }

    public User toModel(UserDto userDto) {
        User user = new User();
        user.setId(userDto.getId());
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        user.setEmail(userDto.getEmail());
        user.setFirstName(userDto.getFirstName());
        user.setMiddleName(userDto.getMiddleName());
        user.setLastName(userDto.getLastName());
        user.setNickname(userDto.getNickname());
        user.setTitle(userDto.getTitle());
        user.setStreet(userDto.getStreet());
        user.setCity(userDto.getCity());
        user.setZipCode(userDto.getZipCode());
        user.setCountry(userDto.getCountry());
        user.setProfession(userDto.getProfession());
        user.setBio(userDto.getBio());
        return user;
    }

}
