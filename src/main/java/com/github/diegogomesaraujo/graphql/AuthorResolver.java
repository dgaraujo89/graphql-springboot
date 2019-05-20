package com.github.diegogomesaraujo.graphql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.github.diegogomesaraujo.entities.Author;
import com.github.diegogomesaraujo.entities.Post;
import com.github.diegogomesaraujo.repositories.PostDao;

@Component
public class AuthorResolver implements GraphQLResolver<Author> {

	@Autowired
	private PostDao postDao;
	
	public List<Post> getPosts(Author author) {
		return postDao.findByAuthorId(author.getId());
	}
	
}
