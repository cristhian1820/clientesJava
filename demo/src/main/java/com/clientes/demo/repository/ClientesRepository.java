package com.clientes.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.clientes.demo.dto.ClientesDto;

@Repository
public interface ClientesRepository extends CrudRepository<ClientesDto, Long> {

}
