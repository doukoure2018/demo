package com.sample.demo.controller;

import com.sample.demo.payload.ChargesDto;
import com.sample.demo.service.ChargesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class ChargesController {

    private ChargesService chargesService;

    public ChargesController(ChargesService chargesService) {
        this.chargesService = chargesService;
    }

    @GetMapping("/digi-crg/v1/charges")
    public ResponseEntity<List<ChargesDto>> getllCharges()
    {
        return ResponseEntity.ok(chargesService.getllCharges());
    }
}
