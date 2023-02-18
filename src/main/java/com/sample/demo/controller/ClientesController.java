package com.sample.demo.controller;

import com.sample.demo.payload.ClientesDto;
import com.sample.demo.payload.ClientesResponse;
import com.sample.demo.service.ClientesService;
import com.sample.demo.utils.AppConstants;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ClientesController {

    private ClientesService clientesService;

    public ClientesController(ClientesService clientesService) {
        this.clientesService = clientesService;
    }

    @PostMapping("/digi-crg/v1/{cod_agence}/addClientes")
    public ResponseEntity<ClientesDto> createClientes(
            @RequestBody ClientesDto clientesDto,
            @PathVariable(value = "cod_agence") String cod_agence)
    {
        return new ResponseEntity<>(clientesService.createClientes(clientesDto,cod_agence),HttpStatus.CREATED);
    }

    @GetMapping("/digi-crg/v1/clientes")
    public ClientesResponse getAllClientes(
            @RequestParam(value = "pageNo", defaultValue = AppConstants.DEFAULT_PAGE_NUMBER, required = false) int pageNo,
            @RequestParam(value = "pageSize", defaultValue = AppConstants.DEFAULT_PAGE_SIZE, required = false) int pageSize,
            @RequestParam(value = "sortBy", defaultValue = AppConstants.DEFAULT_SORT_BY, required = false) String sortBy,
            @RequestParam(value = "sortDir", defaultValue = AppConstants.DEFAULT_SORT_DIRECTION, required = false) String sortDir)
    {
        return clientesService.getAllClientes(pageNo, pageSize, sortBy, sortDir);
    }

    @GetMapping("/digi-crg/v1/clientes/{id}")
    public ResponseEntity<ClientesDto> getClientes(@PathVariable(value = "id") String id)
    {
         ClientesDto clientesDto=clientesService.getClientes(id);
         return ResponseEntity.ok(clientesDto);
    }

}
