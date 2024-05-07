package com.proyecto.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.restaurant.entity.Boleta;
import com.proyecto.restaurant.entity.BoletaMenu;
import com.proyecto.restaurant.entity.BoletaMenuPK;
import com.proyecto.restaurant.repository.BoletaMenuRepository;
import com.proyecto.restaurant.repository.BoletaRepository;

import jakarta.transaction.Transactional;

@Service
public class BoletaService {

	@Autowired
	private BoletaRepository repo;
	
	@Autowired
	private BoletaMenuRepository repoBoletaMenu;
	
	public void save(Boleta b) {
		repo.save(b);
	}
	
	public void update(Boleta b) {
		repo.save(b);
	}
	
	public List<Boleta> findAll(){
		return repo.findAll();
	}
	
	public Boleta findById(Integer codigo) {
		return repo.findById(codigo).orElse(null);
	}
	
	@Transactional
	public void saveBoletaMenu(Boleta b) {
		try {
			for (BoletaMenu bm : b.getListaDetalle()) {
				BoletaMenuPK pk = new BoletaMenuPK();
				pk.setCod_boleta(b.getCodigo());
				pk.setCod_menu(bm.getMenu().getCodigo());
				bm.setPk(pk);
				bm.setSubTotal(bm.getSubTotal());
				bm.setCantidad(bm.getCantidad());
				repoBoletaMenu.save(bm);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
		}
	}
	
}
