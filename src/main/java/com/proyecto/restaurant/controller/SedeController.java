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

import com.proyecto.restaurant.entity.Sede;
import com.proyecto.restaurant.service.SedeService;

@RestController
@RequestMapping(path = "/sede")
public class SedeController {

	@Autowired
	private SedeService servicioSede;
	
	@GetMapping("/findAll")
	public List<Sede> findAll(){
		return servicioSede.findAll();
	}
	
	@PostMapping("/save")
	public void save(@RequestBody Sede s) {
		servicioSede.save(s);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Sede s) {
		servicioSede.update(s);
	}
	
	@GetMapping("/findById/{codigo}")
	public Sede findById(@PathVariable("codigo") Integer codigo) {
		return servicioSede.findById(codigo);
	}
	
	@DeleteMapping("/deleteById/{codigo}")
	public void deleteById(@PathVariable("codigo") Integer codigo) {
		servicioSede.deleteById(codigo);
	}
	
	@GetMapping("/findSedeByUsuario/{codigo}")
	public Sede findSedeByUsuario(@PathVariable("codigo")Integer codigo) {
		return findSedeByUsuario(codigo);
	}
	
}
