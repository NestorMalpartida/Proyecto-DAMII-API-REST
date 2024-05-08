package com.proyecto.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.restaurant.entity.Reserva;
import com.proyecto.restaurant.repository.ReservaRepository;

@Service
public class ReservaService {

	@Autowired
	private ReservaRepository repo;
	
	public void save(Reserva r) {
		repo.save(r);
	}
	
	public void update(Reserva r) {
		repo.save(r);
	}
	
	public List<Reserva> findAll(){
		return repo.findAll();
	}
	
	public Reserva findById(Integer codigo) {
		return repo.findById(codigo).orElse(null);
	}
	
	public void deleteById(Integer codigo) {
		repo.deleteById(codigo);
	}
	
}
