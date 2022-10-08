package com.clientes.demo.response;


import com.clientes.demo.dto.TipoIdentificacion;

import lombok.Data;

@Data
public class ClientesResponse {

	private Long id;

	private TipoIdentificacion tipoIdentificacion;

	private String nombre;

	private String apellidos;

	private Integer edad;

	private Integer telefono;

	private String direccion;

}
