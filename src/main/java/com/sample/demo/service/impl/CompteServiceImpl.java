package com.sample.demo.service.impl;

import com.sample.demo.entity.Compte;
import com.sample.demo.payload.CompteDto;
import com.sample.demo.repository.CompteRepository;
import com.sample.demo.service.CompteService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompteServiceImpl implements CompteService {

    private CompteRepository compteRepository;
    private ModelMapper modelMapper;

    public CompteServiceImpl(CompteRepository compteRepository, ModelMapper modelMapper) {
        this.compteRepository = compteRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<CompteDto> getAllCompteByCodClient(String codClient) {
        List<Compte> comptes=compteRepository.findAllByCodClient(codClient);
        return comptes.stream().map((compte)->modelMapper.map(compte, CompteDto.class))
                .collect(Collectors.toList());
    }
}
