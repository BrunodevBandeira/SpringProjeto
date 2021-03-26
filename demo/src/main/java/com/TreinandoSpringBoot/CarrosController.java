package com.TreinandoSpringBoot;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TreinandoSpringBoot.domain.Carros;
import com.TreinandoSpringBoot.domain.CarrosService;

@RestController
@RequestMapping("/api/v1/carros")
public class CarrosController {
     
	@Autowired
	private CarrosService service;
	
	@GetMapping()
	public Iterable<Carros> get() {
		return service.getCarros();
	}
	
	@GetMapping("/{id}")
	public Optional<Carros> get(@PathVariable("id") Long id) {
		return service.getCarrosById(id);
	}
}


/*
@PostMapping()
public String post() {
	return "Post, SpringBoot";
}


@PutMapping()
public String put() {
	return "Put, SpringBoot";
}


@DeleteMapping()
public String delete() {
	return "DELETE, SpringBoot";
}	


@GetMapping("/login")
public String login(@RequestParam("login") String login, @RequestParam("senha") String senha) {
	return "Login: " + login + " Senha: " + senha;
}
// No navegador, coloque
// localhost:8080/login?login=Bandeira&senha=ABC	
// Isso retorna a senha e o login passados no navegador
*/