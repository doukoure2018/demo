package com.sample.demo.service.impl;

import com.sample.demo.entity.OrigineFond;
import com.sample.demo.payload.OrigineFondDto;
import com.sample.demo.repository.OrigineFondRepository;
import com.sample.demo.service.OrigineFondService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrigineFondServiceImpl implements OrigineFondService {

    private OrigineFondRepository origineFondRepository;
    private ModelMapper modelMapper;

    public OrigineFondServiceImpl(OrigineFondRepository origineFondRepository, ModelMapper modelMapper) {
        this.origineFondRepository = origineFondRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<OrigineFondDto> getAllOrigineFond() {
        List<OrigineFond> origineFonds=origineFondRepository.findAll();
        return origineFonds.stream().map((origineFond)->modelMapper.map(origineFond, OrigineFondDto.class))
                .collect(Collectors.toList());
    }
}
