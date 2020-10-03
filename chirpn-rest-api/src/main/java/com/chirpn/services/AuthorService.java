package com.chirpn.services;

import java.util.List;
import java.util.Optional;

import com.chirpn.entities.Author;

public interface AuthorService {
	public List<Author> findAll();

	public Optional<Author> findOne(Integer id);
	
	public void findChild(Integer id);

	public Author updateAuthor(Integer id);

	public void deleteUser(Integer id);

	public Author save(Author user);

}
