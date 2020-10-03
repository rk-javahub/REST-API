package com.chirpn.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chirpn.entities.Author;
import com.chirpn.services.AuthorService;

@RestController
public class AuthorController {
	@Autowired
	AuthorService authorService;

	@GetMapping("/authors")
	public List<Author> getAllAuthors() {
		return authorService.findAll();
	}

	@GetMapping("/author/{id}")
	public Optional<Author> getAuthorOfId(@PathVariable Integer id) {
		return authorService.findOne(id);
	}

	@PostMapping("/author")
	public Author addAuthor(@RequestBody Author user) {
		return authorService.save(user);
	}

	@PutMapping("/author/{id}")
	public Author updateAuthor(@PathVariable Integer id) {
		return authorService.updateAuthor(id);
	}
	
	@DeleteMapping("/author/{id}")
	public void deleteMapping(@PathVariable Integer id) {
		authorService.deleteUser(id);
	}
}
