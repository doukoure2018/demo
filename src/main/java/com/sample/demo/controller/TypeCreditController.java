package com.sample.demo.controller;

import com.sample.demo.entity.TypeCredit;
import com.sample.demo.payload.TypeCreditDto;
import com.sample.demo.payload.TypeCreditResponse;
import com.sample.demo.service.TypeCreditService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping()
public class TypeCreditController {

    private TypeCreditService typeCreditService;

    public TypeCreditController(TypeCreditService typeCreditService) {
        this.typeCreditService = typeCreditService;
    }

    @GetMapping("/digi-crg/v1/typeCredit")
    public ResponseEntity<List<TypeCreditDto>> getCategories(){
        return ResponseEntity.ok(typeCreditService.getAllTypeCredito());
    }


}
