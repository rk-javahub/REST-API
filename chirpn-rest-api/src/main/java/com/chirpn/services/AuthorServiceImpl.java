package com.chirpn.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chirpn.entities.Author;
import com.chirpn.repository.AuthorRepostory;

@Service
public class AuthorServiceImpl implements AuthorService {

	@Autowired
	AuthorRepostory authorRepository;
	
	@Override
	public List<Author> findAll() {
		return authorRepository.findAll();
	}

	@Override
	public Optional<Author> findOne(Integer id) {
		
		return authorRepository.findById(id);
	}

	@Override
	public void findChild(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(Integer id) {
		authorRepository.deleteById(id);
	}

	@Override
	public Author save(Author user) {
		return authorRepository.save(user);
	}

	@Override
	public Author updateAuthor(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
