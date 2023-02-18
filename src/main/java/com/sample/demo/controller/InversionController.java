package com.sample.demo.controller;

import com.sample.demo.payload.InversionDto;
import com.sample.demo.service.InversionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class InversionController {

    private InversionService inversionService;

    public InversionController(InversionService inversionService) {
        this.inversionService = inversionService;
    }

    @GetMapping("/digi-crg/v1/inversion")
    public ResponseEntity<List<InversionDto>> getAllInversion()
    {
        return ResponseEntity.ok(inversionService.getAllInversion());
    }
}
