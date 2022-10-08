package com.clientes.demo.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.clientes.demo.dto.ClientesDto;
import com.clientes.demo.repository.ClientesRepository;
import com.clientes.demo.request.ClientesRequest;
import com.clientes.demo.response.ClientesResponse;
import com.clientes.demo.response.ProcesoResponse;
import org.springframework.stereotype.Service;

@Service
public class ClientesServiceImpl implements ClientesService {

	@Autowired
	private ClientesRepository clientesRepository;

	@Override
	public ProcesoResponse guardar(ClientesRequest clientesRequest) throws Exception {
		ModelMapper model = new ModelMapper();
		ClientesDto clientesDto = model.map(clientesRequest, ClientesDto.class);

		ProcesoResponse response = new ProcesoResponse();
		clientesRepository.save(clientesDto);
		response.setEstado(true);
		response.setMsj("Guardado con exito");
		return response;
	}

	@Override
	public ProcesoResponse actualizar(ClientesRequest clientesRequest) throws Exception {
		ModelMapper model = new ModelMapper();
		ClientesDto clientesDto = model.map(clientesRequest, ClientesDto.class);

		ProcesoResponse response = new ProcesoResponse();

		if (clientesRepository.existsById(clientesDto.getId())) {

			clientesRepository.save(clientesDto);
			response.setEstado(true);
			response.setMsj("Actualizado con exito");
			return response;
		}

		response.setEstado(false);
		response.setMsj("Ocurrio un error al Actualizar");
		return response;

	}

	@Override
	public ProcesoResponse eliminar(ClientesRequest clientesRequest) throws Exception {
		ModelMapper model = new ModelMapper();
		ClientesDto clientesDto = model.map(clientesRequest, ClientesDto.class);

		ProcesoResponse response = new ProcesoResponse();

		if (clientesRepository.existsById(clientesDto.getId())) {

			clientesRepository.deleteById(clientesDto.getId());
			response.setEstado(true);
			response.setMsj("Eliminado con exito");
			return response;
		}

		response.setEstado(false);
		response.setMsj("Ocurrio un error al eliminar");
		return response;
	}
	
	@Override
	public List<ClientesResponse> consultar() throws Exception{
		ModelMapper model = new ModelMapper();
		List<ClientesDto> response = (List<ClientesDto>) clientesRepository.findAll();
		@SuppressWarnings("unchecked")
		List<ClientesResponse> clientesDto = (List<ClientesResponse>) model.map( response, ClientesResponse.class);
		return clientesDto ;
	}

}
