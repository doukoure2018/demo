package com.sample.demo.controller;

import com.sample.demo.payload.PlanPagosDto;
import com.sample.demo.service.PlanPagosService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping
@RestController
public class PlanPagosController {

    private PlanPagosService planPagosService;

    public PlanPagosController(PlanPagosService planPagosService)
    {
        this.planPagosService = planPagosService;
    }

    @GetMapping("/digi-crg/v1/{numCredito}/planPagos")
    public ResponseEntity<List<PlanPagosDto>> getAllPlanPagosByCreditos(@PathVariable(name = "numCredito") Long numCredito)
    {
        return ResponseEntity.ok(planPagosService.getAllPlanPagosByCreditos(numCredito));
    }
}
