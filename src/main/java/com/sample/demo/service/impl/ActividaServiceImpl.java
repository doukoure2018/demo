package com.sample.demo.service.impl;

import com.sample.demo.entity.Activida;
import com.sample.demo.payload.ActividaDto;
import com.sample.demo.repository.ActividaRepository;
import com.sample.demo.service.ActividaService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ActividaServiceImpl implements ActividaService {

    private ActividaRepository actividaRepository;
    private ModelMapper modelMapper;

    public ActividaServiceImpl(ActividaRepository actividaRepository, ModelMapper modelMapper) {
        this.actividaRepository = actividaRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<ActividaDto> getAllActivida() {
        List<Activida> actividas=actividaRepository.findAll();
        return actividas.stream().map((activida)->modelMapper.map(activida, ActividaDto.class))
                .collect(Collectors.toList());
    }
}
