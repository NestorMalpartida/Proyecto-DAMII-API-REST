package com.proyecto.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.restaurant.entity.Menu;
import com.proyecto.restaurant.repository.MenuRepository;

@Service
public class MenuService {

	@Autowired
	private MenuRepository repo;
	
	public void save(Menu m) {
		repo.save(m);
	}
	
	public void update(Menu m) {
		repo.save(m);
	}
	
	public List<Menu> findAll(){
		return repo.findAll();
	}
	
	public Menu findById(Integer codigo) {
		return repo.findById(codigo).orElse(null);
	}
	
	public void deleteById(Integer codigo) {
		repo.deleteById(codigo);
	}
}
