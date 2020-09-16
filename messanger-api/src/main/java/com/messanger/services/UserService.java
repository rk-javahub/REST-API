package com.messanger.services;

import java.util.List;

import com.messanger.entities.User;

public interface UserService {

	public List<User> findAll();

	public User save();

	public User findOne(User user);

	public User deleteUser(User user);

}
