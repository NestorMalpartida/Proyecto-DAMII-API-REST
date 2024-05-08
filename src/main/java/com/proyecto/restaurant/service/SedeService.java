package com.proyecto.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.restaurant.entity.Sede;
import com.proyecto.restaurant.repository.SedeRepository;

@Service
public class SedeService {

	@Autowired
	private SedeRepository repo;
	
	public void save(Sede s) {
		repo.save(s);
	}
	
	public void update(Sede s) {
		repo.save(s);
	}
	
	public List<Sede> findAll(){
		return repo.findAll();
	}
	
	public Sede findById(Integer codigo) {
		return repo.findById(codigo).orElse(null);
	}
	
	public void deleteById(Integer codigo) {
		repo.deleteById(codigo);
	}
}
