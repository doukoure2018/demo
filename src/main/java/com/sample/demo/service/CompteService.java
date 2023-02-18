package com.sample.demo.service;

import com.sample.demo.payload.CompteDto;

import java.util.List;

public interface CompteService {

    List<CompteDto> getAllCompteByCodClient(String codClient);
}
