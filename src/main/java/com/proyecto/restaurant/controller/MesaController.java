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

import com.proyecto.restaurant.entity.Mesa;
import com.proyecto.restaurant.service.MesaService;

@RestController
@RequestMapping(path = "/mesa")
public class MesaController {

	@Autowired
	private MesaService servicioMesa;
	
	@GetMapping("/findAll")
	public List<Mesa> findAll(){
		return servicioMesa.findAll();
	}
	
	@PostMapping("/save")
	public void save(@RequestBody Mesa m) {
		servicioMesa.save(m);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Mesa m) {
		servicioMesa.update(m);
	}
	
	@GetMapping("/findById/{codigo}")
	public Mesa findById(@PathVariable("codigo") Integer codigo) {
		return servicioMesa.findById(codigo);
	}
	
	@DeleteMapping("/deleteById/{codigo}")
	public void deleteById(@PathVariable("codigo") Integer codigo) {
		servicioMesa.deleteById(codigo);
	}
	
	@GetMapping("/findMesaBySede/{codigo}")
	public List<Mesa> findMesaBySede(@PathVariable("codigo") Integer codigo){
		return servicioMesa.findMesaBySede(codigo);
	}
	
}
