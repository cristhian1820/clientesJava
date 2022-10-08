package com.clientes.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clientes.demo.request.ClientesRequest;
import com.clientes.demo.response.ClientesResponse;
import com.clientes.demo.response.ProcesoResponse;
import com.clientes.demo.service.ClientesService;

@RestController
@RequestMapping("/clientes")
public class ClientesController {

	@Autowired
	private ClientesService clientesService;

	@PostMapping("/guardar")
	public ResponseEntity<ProcesoResponse> guarar(@RequestBody ClientesRequest clientesRequest) throws Exception {
		return ResponseEntity.ok().body(clientesService.guardar(clientesRequest));
	}

	@PostMapping("/actualizar")
	public ResponseEntity<ProcesoResponse> actualizar(@RequestBody ClientesRequest clientesRequest) throws Exception {
		return ResponseEntity.ok().body(clientesService.actualizar(clientesRequest));
	}

	@PostMapping("/eliminar")
	public ResponseEntity<ProcesoResponse> eliminar(@RequestBody ClientesRequest clientesRequest) throws Exception {
		return ResponseEntity.ok().body(clientesService.eliminar(clientesRequest));
	}

	@GetMapping("/consultar")
	public ResponseEntity<List<ClientesResponse>> consultar() throws Exception {
		return ResponseEntity.ok().body(clientesService.consultar());
	}

}
