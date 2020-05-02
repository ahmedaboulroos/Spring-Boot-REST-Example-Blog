package io.amin.blog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.amin.blog.models.User;
import io.amin.blog.repositories.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

	public User getAdminUser() {
		return userRepository.findByIsAdminTrue();
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public User getUserById(int userId) {
		return userRepository.findById(userId).orElseThrow();
	}

	public User createNewUser(User user) {
		return userRepository.save(user);
	}

	public User updateUserDetails(int userId, User user) {
		return userRepository.save(user);
	}

	public User deleteUserById(int userId) {
		User user = userRepository.findById(userId).orElseThrow();
		userRepository.deleteById(userId);
		return user;
	}

}