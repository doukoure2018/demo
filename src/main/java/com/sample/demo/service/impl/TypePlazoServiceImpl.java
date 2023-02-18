package com.sample.demo.service.impl;

import com.sample.demo.entity.TypePlazo;
import com.sample.demo.payload.TypePlazoDto;
import com.sample.demo.repository.TypePlazoRepository;
import com.sample.demo.service.TypePlazoService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TypePlazoServiceImpl  implements TypePlazoService {

    private TypePlazoRepository typePlazoRepository;
    private ModelMapper modelMapper;

    public TypePlazoServiceImpl(TypePlazoRepository typePlazoRepository, ModelMapper modelMapper) {
        this.typePlazoRepository = typePlazoRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<TypePlazoDto> getAllTypePlazo() {
        List<TypePlazo> typePlazos=typePlazoRepository.findAll();

        return typePlazos.stream().map((typePlazo)->modelMapper.map(typePlazo,TypePlazoDto.class))
                .collect(Collectors.toList());
    }
}
