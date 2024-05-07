package com.proyecto.restaurant.entity;

import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class BoletaMenuPK {

	private int cod_boleta;
	private int cod_menu;
	
	@Override
	public int hashCode() {
		return Objects.hash(cod_boleta, cod_menu);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BoletaMenuPK other = (BoletaMenuPK) obj;
		return cod_boleta == other.cod_boleta && cod_menu == other.cod_menu;
	}
	
	public int getCod_boleta() {
		return cod_boleta;
	}
	
	public void setCod_boleta(int cod_boleta) {
		this.cod_boleta = cod_boleta;
	}
	
	public int getCod_menu() {
		return cod_menu;
	}
	
	public void setCod_menu(int cod_menu) {
		this.cod_menu = cod_menu;
	}
	
}
