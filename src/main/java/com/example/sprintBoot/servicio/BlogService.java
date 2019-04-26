package com.example.sprintBoot.servicio;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sprintBoot.modelo.Blog;
import com.example.sprintBoot.repository.BlogRepository;

@Service
public class BlogService {

	//La variable es inyectable
	
		@Autowired
		private BlogRepository blogRepository;
		
		
		//retorna todos los registros que se encuentran en la entidad
		
		public List<Blog> consulta(){
			return blogRepository.findAll();
		}
		
		public Blog consutaPorId(int id) {
		//return blogRepository.findOne(id);  //<version>1.5.3.RELEASE</version>
			return blogRepository.getOne(id);  //<version>2.1.2.RELEASE</version> 
		}
		
		public Blog registro(Blog blog) {
			return blogRepository.save(blog);
		}
		
		public void elimiar(Blog blog) {
			blogRepository.delete(blog);
		
		}
}
