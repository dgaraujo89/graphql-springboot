package com.github.diegogomesaraujo.graphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.github.diegogomesaraujo.entities.Author;
import com.github.diegogomesaraujo.entities.Post;
import com.github.diegogomesaraujo.repositories.AuthorDao;

@Component
public class PostResolver implements GraphQLResolver<Post> {

	@Autowired
	private AuthorDao authorDao;
	
	public Author getAuthor(Post post) {
		return authorDao.findById(post.getAuthorId()).orElse(null);
	}
	
}
