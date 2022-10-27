package com.spring.codeblog.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeblogRepository;

public class DummyData {
	
	@Autowired
	CodeblogRepository codeblogRepository;
	
	@PostConstruct
	public void savePosts() {
		
		List<Post> postList = new ArrayList<>();
		Post post1 = new Post();
		
		post1.setAutor("Danilo Calixto");
		post1.setData(LocalDate.now());
		post1.setTitulo("HTML - CSS - JS");
		post1.setTexto("Lorem, ipsum dolor sit amet consectetur adipisicing elit. Consectetur qui reprehenderit praesentium, nam dolorum quasi expedita repudiandae omnis distinctio doloremque id amet impedit est nisi. Facilis veritatis explicabo modi quidem?");
		
		Post post2 = new Post();
		post2.setAutor("Danilo Calixto");
		post2.setData(LocalDate.now());
		post2.setTitulo("API REST - Teste");
		post2.setTexto("Lorem, ipsum dolor sit amet consectetur adipisicing elit. Consectetur qui reprehenderit praesentium, nam dolorum quasi expedita repudiandae omnis distinctio doloremque id amet impedit est nisi. Facilis veritatis explicabo modi quidem?");
		
		postList.add(post1);
		postList.add(post2);
		
		for(Post post: postList) {
			Post postSaved = codeblogRepository.save(post);
			System.out.println(postSaved.getId());
			
		}
		
	}

}
