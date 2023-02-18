package com.sample.demo.service.impl;

import com.sample.demo.entity.SousActivite;
import com.sample.demo.payload.SousActiviteDto;
import com.sample.demo.repository.SousActiviteRepository;
import com.sample.demo.service.SousActiviteService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SousActiviteServiceImpl implements SousActiviteService {

    private SousActiviteRepository sousActiviteRepository;
    private ModelMapper modelMapper;

    public SousActiviteServiceImpl(SousActiviteRepository sousActiviteRepository, ModelMapper modelMapper) {
        this.sousActiviteRepository = sousActiviteRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<SousActiviteDto> getAllSousActivite() {
        List<SousActivite> sousActivites=sousActiviteRepository.findAll();

        return sousActivites.stream().map((sousActivite)->modelMapper.map(sousActivite, SousActiviteDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<SousActiviteDto> getAllSousActiviteByActivite(String codActividad)
    {
        List<SousActivite> sousActivites=sousActiviteRepository.findAllByCodActividad(codActividad);

        return sousActivites.stream().map((sousActivite)->modelMapper.map(sousActivite, SousActiviteDto.class))
                .collect(Collectors.toList());
    }
}
