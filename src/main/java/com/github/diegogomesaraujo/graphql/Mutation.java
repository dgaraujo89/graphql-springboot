package com.github.diegogomesaraujo.graphql;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.github.diegogomesaraujo.entities.Post;
import com.github.diegogomesaraujo.repositories.PostDao;

@Component
public class Mutation implements GraphQLMutationResolver {

	private PostDao postDao;
	
	public Post writePost(String title, String text, String category, Long author) {
		var post = new Post(null, title, text, category, 1L);
		return postDao.save(post);
	}
	
}
