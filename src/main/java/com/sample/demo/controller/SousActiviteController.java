package com.sample.demo.controller;

import com.sample.demo.payload.SousActiviteDto;
import com.sample.demo.service.SousActiviteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class SousActiviteController {

    private SousActiviteService sousActiviteService;

    public SousActiviteController(SousActiviteService sousActiviteService) {
        this.sousActiviteService = sousActiviteService;
    }

    @GetMapping("/digi-crg/v1/sousActivite")
    public ResponseEntity<List<SousActiviteDto>> getAllSousActivite()
    {
       return ResponseEntity.ok(sousActiviteService.getAllSousActivite());
    }

    @GetMapping("/digi-crg/v1/{codActividad}/sousActivite")
    public ResponseEntity<List<SousActiviteDto>> getAllSousActiviteByActivite(@PathVariable(name = "codActividad")
                                                                                  String codActividad)
    {
        return ResponseEntity.ok(sousActiviteService.getAllSousActiviteByActivite(codActividad));
    }
}
