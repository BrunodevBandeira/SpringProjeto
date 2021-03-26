package com.TreinandoSpringBoot;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

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
	
}
