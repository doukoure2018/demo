package com.sample.demo.controller;

import com.sample.demo.payload.TypePlazoDto;
import com.sample.demo.service.TypePlazoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class TypePlazoController {

    private TypePlazoService typePlazoService;

    public TypePlazoController(TypePlazoService typePlazoService) {
        this.typePlazoService = typePlazoService;
    }

    @GetMapping("/digi-crg/v1/typePlazo")
    public ResponseEntity<List<TypePlazoDto>> getAllTypePlazo()
    {
        return ResponseEntity.ok(typePlazoService.getAllTypePlazo());
    }
}
