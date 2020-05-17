package io.amin.blog.services;

import io.amin.blog.models.User;
import io.amin.blog.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
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