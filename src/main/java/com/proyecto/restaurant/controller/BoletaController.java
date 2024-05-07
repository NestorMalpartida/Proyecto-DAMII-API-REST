package com.proyecto.restaurant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.restaurant.entity.Boleta;
import com.proyecto.restaurant.service.BoletaService;

@RestController
@RequestMapping(path = "/boleta")
public class BoletaController {

	@Autowired
	private BoletaService servicioBoleta;
	
	@GetMapping("/findAll")
	public List<Boleta> findAll(){
		return servicioBoleta.findAll();
	}
	
	@PostMapping("/save")
	public void save(@RequestBody Boleta b) {
		servicioBoleta.save(b);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Boleta b) {
		servicioBoleta.update(b);
	}
	
	@GetMapping("/findById/{codigo}")
	public Boleta findById(@PathVariable("codigo") Integer codigo) {
		return servicioBoleta.findById(codigo);
	}
	
	@PostMapping("/saveDetalle")
	public void saveBoletaMenu(@RequestBody Boleta b) {
		servicioBoleta.saveBoletaMenu(b);
	}
	
}
