package com.sample.demo.controller;

import com.sample.demo.payload.CompteDto;
import com.sample.demo.service.CompteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class CompteController {

    private CompteService compteService;

    public CompteController(CompteService compteService) {
        this.compteService = compteService;
    }

    @GetMapping("/digi-crg/v1/{codClient}/Compte")
    public ResponseEntity<List<CompteDto>> getAllCompteByCodClient(@PathVariable(name = "codClient") String codClient)
    {
          return ResponseEntity.ok(compteService.getAllCompteByCodClient(codClient));
    }
}
