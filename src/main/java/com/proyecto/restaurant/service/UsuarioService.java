package com.proyecto.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.restaurant.entity.Usuario;
import com.proyecto.restaurant.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repo;
	
	public void save(Usuario u) {
		repo.save(u);
	}
	
	public void update(Usuario u) {
		repo.save(u);
	}
	
	public List<Usuario> findAll(){
		return repo.findAll();
	}
	
	public Usuario findById(Integer codigo) {
		return repo.findById(codigo).orElse(null);
	}
	
	public void deleteById(Integer codigo) {
		repo.deleteById(codigo);
	}
}
