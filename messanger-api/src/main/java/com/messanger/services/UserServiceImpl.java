package com.messanger.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.messanger.entities.User;
import com.messanger.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public User save(User user) {
		return userRepository.save(user);
	}

	public User findOne(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public User deleteUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
