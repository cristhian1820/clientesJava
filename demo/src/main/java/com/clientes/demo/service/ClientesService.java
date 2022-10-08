package com.clientes.demo.service;

import java.util.List;

import com.clientes.demo.request.ClientesRequest;
import com.clientes.demo.response.ClientesResponse;
import com.clientes.demo.response.ProcesoResponse;

public interface ClientesService {

	ProcesoResponse guardar(ClientesRequest clientesRequest) throws Exception;
	
	ProcesoResponse actualizar(ClientesRequest clientesRequest) throws Exception;
	
	ProcesoResponse eliminar(ClientesRequest clientesRequest) throws Exception;
	
	List<ClientesResponse> consultar() throws Exception;
}
