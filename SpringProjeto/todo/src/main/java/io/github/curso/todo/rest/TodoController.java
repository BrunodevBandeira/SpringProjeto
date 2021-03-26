package io.github.curso.todo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import io.github.curso.todo.model.Todo;
import io.github.curso.todo.repository.TodoRepository;
@RestController
@RequestMapping("/api/todos")
public class TodoController {
	
	
	 @Autowired
	 private TodoRepository repository;
	 
	 @PostMapping
	 public Todo save(@RequestBody Todo todo) { //@RequestBody, você usa isso para volar um resultado
		 return repository.save(todo);          //em Json no postman, por isso que no postman,vc usa
	 }                                          //o caminho, body ->raw -> Json
	 
	 @GetMapping("{id}")
	 public Todo getById(@PathVariable Long id) { //@PathVariable, garante que a URI que o GetMapping
		 return repository.                       //pegar, sera jogada para dentro do método, com isso 
				 findById(id) 					  //o postman sabe o caminho que tem que fazer.
				 .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
	 }
}







