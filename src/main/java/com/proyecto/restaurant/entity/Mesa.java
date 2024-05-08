package com.proyecto.restaurant.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_mesa")
public class Mesa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_mesa")
	private Integer codigo;
	
	@Column(name = "numero")
	private String numero;
	
	@Column(name = "cantidad_sillas")
	private int cantidadSillas;
	
	@ManyToOne
	@JoinColumn(name = "cod_sede")
	private Sede sede;
	
	@JsonIgnore
	@OneToMany(mappedBy = "mesa")
	private List<Reserva> listaReserva;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getCantidadSillas() {
		return cantidadSillas;
	}

	public void setCantidadSillas(int cantidadSillas) {
		this.cantidadSillas = cantidadSillas;
	}

	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}

	public List<Reserva> getListaReserva() {
		return listaReserva;
	}

	public void setListaReserva(List<Reserva> listaReserva) {
		this.listaReserva = listaReserva;
	}

}
