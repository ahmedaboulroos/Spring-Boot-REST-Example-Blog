package io.amin.blog.services;

import io.amin.blog.services.dto.CommentDto;
import io.amin.blog.services.dto.RoleDto;
import io.amin.blog.services.dto.TagDto;
import io.amin.blog.services.dto.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> getAllUsers();

    UserDto getUserById(int userId);

    UserDto createNewUser(UserDto userDto);

    UserDto updateUserDetails(int userId, UserDto userDto);

    void deleteUserById(int userId);

    List<RoleDto> getUserRoles(int userId);

    List<TagDto> getUserInterests(int userId);

    void addUserInterest(int userId, TagDto tagDto);

    List<CommentDto> getUserComments(int userId);
}
