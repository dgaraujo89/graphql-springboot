package com.github.diegogomesaraujo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.diegogomesaraujo.entities.Author;

public interface AuthorDao extends JpaRepository<Author, Long> {

	
	
}
