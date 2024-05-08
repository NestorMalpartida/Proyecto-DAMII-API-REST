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
@Table(name = "tb_sede")
public class Sede {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_sede")
	private Integer codigo;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "direccion")
	private String direccion;
	
	@ManyToOne
	@JoinColumn(name = "cod_usuario")
	private Usuario usuario;
	
	@JsonIgnore
	@OneToMany(mappedBy = "sede")
	private List<Reserva> listaReserva;
	
	@JsonIgnore
	@OneToMany(mappedBy = "sede")
	private List<Mesa> listaMesa;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Reserva> getListaReserva() {
		return listaReserva;
	}

	public void setListaReserva(List<Reserva> listaReserva) {
		this.listaReserva = listaReserva;
	}

	public List<Mesa> getListaMesa() {
		return listaMesa;
	}

	public void setListaMesa(List<Mesa> listaMesa) {
		this.listaMesa = listaMesa;
	}
	
}
