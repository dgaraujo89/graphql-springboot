package com.github.diegogomesaraujo.graphql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.github.diegogomesaraujo.entities.Post;
import com.github.diegogomesaraujo.repositories.PostDao;

@Component
public class Query implements GraphQLQueryResolver {

	@Autowired
	private PostDao postDao;
	
	public List<Post> getListPosts() {
		return this.postDao.findAll();
	}
}
