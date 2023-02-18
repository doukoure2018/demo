package com.sample.demo.controller;

import com.sample.demo.payload.OrigineFondDto;
import com.sample.demo.service.OrigineFondService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping
@RestController
public class OrigineFondController {
    private OrigineFondService origineFondService;

    public OrigineFondController(OrigineFondService origineFondService) {
        this.origineFondService = origineFondService;
    }

    @GetMapping("/digi-crg/v1/origineFond")
    public ResponseEntity<List<OrigineFondDto>> getAllOrigineFond()
    {
         return ResponseEntity.ok(origineFondService.getAllOrigineFond());
    }
}
