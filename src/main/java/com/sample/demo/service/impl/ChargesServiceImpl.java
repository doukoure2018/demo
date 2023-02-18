package com.sample.demo.service.impl;

import com.sample.demo.entity.Charges;
import com.sample.demo.payload.ChargesDto;
import com.sample.demo.repository.ChargesRepository;
import com.sample.demo.service.ChargesService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ChargesServiceImpl implements ChargesService {

    private ChargesRepository chargesRepository;
    private ModelMapper modelMapper;

    public ChargesServiceImpl(ChargesRepository chargesRepository, ModelMapper modelMapper) {
        this.chargesRepository = chargesRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<ChargesDto> getllCharges() {
        List<Charges> charges=chargesRepository.findAll();

        return charges.stream().map((charges1)->modelMapper.map(charges1, ChargesDto.class))
                .collect(Collectors.toList());
    }
}
