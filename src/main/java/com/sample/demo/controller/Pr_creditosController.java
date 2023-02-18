package com.sample.demo.controller;

import com.sample.demo.payload.Pr_creditoDto;
import com.sample.demo.service.Pr_creditosService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class Pr_creditosController {

    private Pr_creditosService creditosService;

    public Pr_creditosController(Pr_creditosService creditosService) {
        this.creditosService = creditosService;
    }

    @PostMapping("/digi-crg/v1/creditos")
    public ResponseEntity<Pr_creditoDto> createCredito(@RequestBody Pr_creditoDto pr_creditoDto)
    {
        return new ResponseEntity<>(creditosService.createCreditos(pr_creditoDto), HttpStatus.CREATED);
    }

    @GetMapping("/digi-crg/{usuarios}/creditos")
    public List<Pr_creditoDto> getAllCreditos(@PathVariable(value = "usuarios") String usuarios)
    {
        return creditosService.getAllCreditosByUsuarios(usuarios);
    }

    @GetMapping("digi-crg/v1/lastCredito")
    public ResponseEntity<Pr_creditoDto> getMaxRowCredito(){
        return ResponseEntity.ok(creditosService.getMaxRowCredito());
    }

    @GetMapping("digi-crg/v1/{codCliente}/creditos")
    public ResponseEntity<List<Pr_creditoDto>> getAllCreditosByCodCliente(@PathVariable(name = "codCliente") String codCliente)
    {
        return ResponseEntity.ok(creditosService.getAllCreditosByClientes(codCliente));
    }



}
