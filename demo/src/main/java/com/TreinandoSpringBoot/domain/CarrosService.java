package com.TreinandoSpringBoot.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CarrosService {
	
	@Autowired
	private CarroRepository rep;
	
	public Iterable<Carros> getCarros(){
		return rep.findAll();
	}
	
	public Optional<Carros> getCarrosById(Long id) {
		return rep.findById(id);
	}


	public List<Carros> getCarrosFake() {

		List<Carros> carros = new ArrayList<>();

		carros.add(new Carros(1L, "Fusca"));
		carros.add(new Carros(2L, "Brasilia"));	
		carros.add(new Carros(3L, "Chevette"));

		return carros;
	}

}
