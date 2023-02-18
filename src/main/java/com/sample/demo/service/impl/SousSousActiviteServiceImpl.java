package com.sample.demo.service.impl;

import com.sample.demo.entity.SousSousActivite;
import com.sample.demo.payload.SousSousActiviteDto;
import com.sample.demo.repository.SousSousActiviteRepository;
import com.sample.demo.service.SousSousActiviteService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SousSousActiviteServiceImpl implements SousSousActiviteService {

    private SousSousActiviteRepository sousSousActiviteRepository;
    private ModelMapper modelMapper;

    public SousSousActiviteServiceImpl(SousSousActiviteRepository sousSousActiviteRepository, ModelMapper modelMapper) {
        this.sousSousActiviteRepository = sousSousActiviteRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<SousSousActiviteDto> getAllSousSousActivite() {
        List<SousSousActivite> sousSousActivites=sousSousActiviteRepository.findAll();
        return sousSousActivites.stream().map((sousSousActivite)->modelMapper.map(sousSousActivite, SousSousActiviteDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<SousSousActiviteDto> getAllSousSousActiviteByCod(String codSousActivite) {
        List<SousSousActivite> sousSousActivites=sousSousActiviteRepository.findAllByCodSousActivite(codSousActivite);
        return sousSousActivites.stream().map((sousSousActivite)->modelMapper.map(sousSousActivite, SousSousActiviteDto.class))
                .collect(Collectors.toList());
    }
}
