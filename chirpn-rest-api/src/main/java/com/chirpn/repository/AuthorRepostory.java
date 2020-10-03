package com.chirpn.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.chirpn.entities.Author;

@Repository
public interface AuthorRepostory extends JpaRepositoryImplementation<Author, Integer> {

}
