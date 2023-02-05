package com.sample.demo.service;

import com.sample.demo.payload.ClientesDto;
import com.sample.demo.payload.ClientesResponse;

public interface ClientesService {

    ClientesDto createClientes(ClientesDto clientesDto,String cod_agence);

    ClientesResponse getAllClientes(int pageNo, int pageSize, String sortBy, String sortDi);

    ClientesDto getClientes(String id);

    ClientesDto updateClientes(ClientesDto clientesDto,String id);

    void deleteClientes(String id);
}
