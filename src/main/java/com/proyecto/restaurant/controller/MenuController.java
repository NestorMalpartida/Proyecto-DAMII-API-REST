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

import com.proyecto.restaurant.entity.Menu;
import com.proyecto.restaurant.service.MenuService;

@RestController
@RequestMapping(path = "/menu")
public class MenuController {

	@Autowired
	private MenuService servicioMenu;
	
	@GetMapping("/findAll")
	public List<Menu> findAll(){
		return servicioMenu.findAll();
	}
	
	@PostMapping("/save")
	public void save(@RequestBody Menu m) {
		servicioMenu.save(m);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Menu m) {
		servicioMenu.update(m);
	}
	
	@GetMapping("/findById/{codigo}")
	public Menu findById(@PathVariable("codigo") Integer codigo) {
		return servicioMenu.findById(codigo);
	}
	
	@DeleteMapping("/deleteById/{codigo}")
	public void deleteById(@PathVariable("codigo") Integer codigo) {
		servicioMenu.deleteById(codigo);
	}
}
