package com.github.diegogomesaraujo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.diegogomesaraujo.entities.Post;

public interface PostDao extends JpaRepository<Post, Long> {
	
	public List<Post> findByAuthorId(Long id);
	
}
