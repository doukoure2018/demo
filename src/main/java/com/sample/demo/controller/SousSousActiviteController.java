package com.sample.demo.controller;

import com.sample.demo.payload.SousSousActiviteDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sample.demo.service.SousSousActiviteService;

import java.util.List;

@RestController
@RequestMapping
public class SousSousActiviteController {
    private SousSousActiviteService sousSousActiviteService;

    public SousSousActiviteController(SousSousActiviteService sousSousActiviteService) {
        this.sousSousActiviteService = sousSousActiviteService;
    }

    @GetMapping("/digi-crg/v1/{codSousActivite}/sousSousActivite")
    public ResponseEntity<List<SousSousActiviteDto>> getAllSousSousActiviteByCod(@PathVariable(name = "codSousActivite") String codSousActivite)
    {
        return ResponseEntity.ok(sousSousActiviteService.getAllSousSousActiviteByCod(codSousActivite));
    }

    @GetMapping("/digi-crg/v1/sousSousActivite")
    public ResponseEntity<List<SousSousActiviteDto>> getAllSousSousActivite()
    {
        return ResponseEntity.ok(sousSousActiviteService.getAllSousSousActivite());
    }
}
