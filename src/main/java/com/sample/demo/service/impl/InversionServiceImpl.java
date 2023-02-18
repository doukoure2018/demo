package com.sample.demo.service.impl;

import com.sample.demo.entity.Inversion;
import com.sample.demo.payload.InversionDto;
import com.sample.demo.repository.InversionRepository;
import com.sample.demo.service.InversionService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InversionServiceImpl implements InversionService {

    private InversionRepository inversionRepository;
    private ModelMapper modelMapper;

    public InversionServiceImpl(InversionRepository inversionRepository, ModelMapper modelMapper) {
        this.inversionRepository = inversionRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<InversionDto> getAllInversion() {
        List<Inversion> inversions=inversionRepository.findAll();

        return inversions.stream().map((inversion)->modelMapper.map(inversion,InversionDto.class))
                .collect(Collectors.toList());
    }
}
