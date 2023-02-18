package com.sample.demo.controller;

import com.sample.demo.payload.ActividaDto;
import com.sample.demo.service.ActividaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class ActividaServiceController {

    private ActividaService actividaService;

    public ActividaServiceController(ActividaService actividaService) {
        this.actividaService = actividaService;
    }

    @GetMapping("/digi-crg/v1/activida")
    public ResponseEntity<List<ActividaDto>> getAllActivida()
    {
        return ResponseEntity.ok(actividaService.getAllActivida());
    }
}
