package com.messanger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.messanger.entities.User;
import com.messanger.services.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/users")
	public List<User> getAllUsers() {
		return null;
	}

	@GetMapping("/user/{id}")
	public User getUserOfId(int id) {
		return null;
	}

	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
		return userService.save(user);
	}

}
