package com.sample.demo.service.impl;

import com.sample.demo.entity.TypeCredit;
import com.sample.demo.payload.TypeCreditDto;
import com.sample.demo.repository.TypeCreditRepository;
import com.sample.demo.service.TypeCreditService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TypeCreditServiceImpl implements TypeCreditService {

    private ModelMapper modelMapper;
    private TypeCreditRepository typeCreditRepository;

    public TypeCreditServiceImpl(ModelMapper modelMapper, TypeCreditRepository typeCreditRepository) {
        this.modelMapper = modelMapper;
        this.typeCreditRepository = typeCreditRepository;
    }

    @Override
    public List<TypeCreditDto> getAllTypeCredito() {
        List<TypeCredit> typeCredits=typeCreditRepository.findAll();
        return typeCredits.stream().map((typeCredit) -> modelMapper.map(typeCredit, TypeCreditDto.class))
                .collect(Collectors.toList());
    }

}
