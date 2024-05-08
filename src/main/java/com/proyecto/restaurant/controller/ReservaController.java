package com.proyecto.restaurant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.restaurant.entity.Reserva;
import com.proyecto.restaurant.service.ReservaService;

@RestController
@RequestMapping(path = "/reserva")
public class ReservaController {

	@Autowired
	private ReservaService servicioReserva;
	
	@GetMapping("/findAll")
	public List<Reserva> findAll(){
		return servicioReserva.findAll();
	}
	
	@PostMapping("/save")
	public void save(@RequestBody Reserva r) {
		servicioReserva.save(r);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Reserva r) {
		servicioReserva.update(r);
	}
	
	@GetMapping("/findById/{codigo}")
	public Reserva findById(@PathVariable("codigo") Integer codigo) {
		return servicioReserva.findById(codigo);
	}
	
	@DeleteMapping("/deleteById/{codigo}")
	public void deleteById(@PathVariable("codigo") Integer codigo) {
		servicioReserva.deleteById(codigo);
	}
	
}
