package com.proyecto.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.restaurant.entity.Mesa;
import com.proyecto.restaurant.repository.MesaRepository;

@Service
public class MesaService {

	@Autowired
	private MesaRepository repo;
	
	public void save(Mesa m) {
		repo.save(m);
	}
	
	public void update(Mesa m) {
		repo.save(m);
	}
	
	public List<Mesa> findAll(){
		return repo.findAll();
	}
	
	public Mesa findById(Integer codigo) {
		return repo.findById(codigo).orElse(null);
	}
	
	public void deleteById(Integer codigo) {
		repo.deleteById(codigo);
	}
	
	public List<Mesa> findMesaBySede(Integer codigo){
		return repo.findMesaBySede(codigo);
	}
}
