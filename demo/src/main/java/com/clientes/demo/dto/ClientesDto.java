package com.clientes.demo.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ClientesDto implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name ="id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "tipo_identificacion")
	private TipoIdentificacion tipoIdentificacion;
	
	private String nombre;
	
	private String apellidos;
	
	private Integer edad;
	
	private Integer telefono;
	
	private String direccion;
	
}
