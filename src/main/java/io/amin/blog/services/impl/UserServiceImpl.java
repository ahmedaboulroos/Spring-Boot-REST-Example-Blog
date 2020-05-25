package io.amin.blog.services.impl;

import io.amin.blog.models.User;
import io.amin.blog.repositories.UserRepository;
import io.amin.blog.services.UserService;
import io.amin.blog.services.dto.CommentDto;
import io.amin.blog.services.dto.RoleDto;
import io.amin.blog.services.dto.TagDto;
import io.amin.blog.services.dto.UserDto;
import io.amin.blog.services.mapper.CommentMapper;
import io.amin.blog.services.mapper.RoleMapper;
import io.amin.blog.services.mapper.TagMapper;
import io.amin.blog.services.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final RoleMapper roleMapper;
    private final TagMapper tagMapper;
    private final CommentMapper commentMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper, RoleMapper roleMapper, TagMapper tagMapper, CommentMapper commentMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
        this.roleMapper = roleMapper;
        this.tagMapper = tagMapper;
        this.commentMapper = commentMapper;
    }

    @Override
    public List<UserDto> getAllUsers() {
        return userMapper.toDtoList(userRepository.findAll());
    }

    @Override
    public UserDto getUserById(int userId) {
        return userMapper.toDto(userRepository.findById(userId).orElseThrow());
    }

    @Override
    public UserDto createNewUser(UserDto userDto) {
        return userMapper.toDto(userRepository.save(userMapper.toModel(userDto)));
    }

    @Override
    public UserDto updateUserDetails(int userId, UserDto userDto) {
        return userMapper.toDto(userRepository.save(userMapper.toModel(userDto)));
    }

    @Override
    public void deleteUserById(int userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public List<RoleDto> getUserRoles(int userId) {
        return roleMapper.toDtoList(userRepository.findById(userId).orElseThrow().getRoles());
    }

    @Override
    public List<TagDto> getUserInterests(int userId) {
        return tagMapper.toDtoList(userRepository.findById(userId).orElseThrow().getInterests());
    }

    @Override
    public void addUserInterest(int userId, TagDto tagDto) {
        User user = userRepository.findById(userId).orElseThrow();
        user.getInterests().add(tagMapper.toModel(tagDto));
        userRepository.save(user);
    }

    @Override
    public List<CommentDto> getUserComments(int userId) {
        return commentMapper.toDtoList(userRepository.findById(userId).orElseThrow().getComments());
    }

}