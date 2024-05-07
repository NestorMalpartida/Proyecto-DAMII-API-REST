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

import com.proyecto.restaurant.entity.Usuario;
import com.proyecto.restaurant.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService servicioUsuario;
	
	@GetMapping("/findAll")
	public List<Usuario> findAll(){
		return servicioUsuario.findAll();
	}
	
	@PostMapping("/save")
	public void save(@RequestBody Usuario u) {
		servicioUsuario.save(u);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Usuario u) {
		servicioUsuario.update(u);
	}
	
	@GetMapping("/findById/{codigo}")
	public Usuario findById(@PathVariable("codigo") Integer codigo) {
		return servicioUsuario.findById(codigo);
	}
	
	@DeleteMapping("/deleteById/{codigo}")
	public void deleteById(@PathVariable("codigo") Integer codigo) {
		servicioUsuario.deleteById(codigo);
	}
}
