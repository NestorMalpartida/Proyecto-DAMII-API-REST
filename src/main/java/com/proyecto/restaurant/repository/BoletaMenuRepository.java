package com.proyecto.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.restaurant.entity.BoletaMenu;
import com.proyecto.restaurant.entity.BoletaMenuPK;

public interface BoletaMenuRepository extends JpaRepository<BoletaMenu, BoletaMenuPK> {

}
