package com.github.diegogomesaraujo.graphql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.github.diegogomesaraujo.entities.Author;
import com.github.diegogomesaraujo.entities.Post;
import com.github.diegogomesaraujo.repositories.AuthorDao;
import com.github.diegogomesaraujo.repositories.PostDao;

@Component
public class Query implements GraphQLQueryResolver {

	@Autowired
	private PostDao postDao;

	@Autowired
	private AuthorDao authorDao;
	
	public List<Post> getListPosts() {
		return this.postDao.findAll();
	}
	
	public Author getAuthorById(Long id) {
		return authorDao.findById(id).orElse(null);
	}
	
}
