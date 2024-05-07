package com.proyecto.restaurant.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_detalleboleta")
public class BoletaMenu {

	@EmbeddedId
	private BoletaMenuPK pk;
	
	@ManyToOne
	@JoinColumn(name = "cod_boleta",insertable = false,updatable = false,referencedColumnName = "cod_boleta")
	private Boleta boleta;
	
	@ManyToOne
	@JoinColumn(name = "cod_menu",insertable = false,updatable = false,referencedColumnName = "cod_menu")
	private Menu menu;
	
	@Column(name = "cantidad")
	private int cantidad;
	
	@Column(name = "subtotal")
	private double subTotal;

	public BoletaMenuPK getPk() {
		return pk;
	}

	public void setPk(BoletaMenuPK pk) {
		this.pk = pk;
	}

	public Boleta getBoleta() {
		return boleta;
	}

	public void setBoleta(Boleta boleta) {
		this.boleta = boleta;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	
}
