package com.sample.demo.service.impl;

import com.sample.demo.entity.PlanPagos;
import com.sample.demo.payload.PlanPagosDto;
import com.sample.demo.repository.PlanPagosDtoRepository;
import com.sample.demo.service.PlanPagosService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlanPagosServiceImpl implements PlanPagosService {

    private PlanPagosDtoRepository planPagosDtoRepository;
    private ModelMapper modelMapper;

    public PlanPagosServiceImpl(PlanPagosDtoRepository planPagosDtoRepository, ModelMapper modelMapper)
    {
        this.planPagosDtoRepository = planPagosDtoRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<PlanPagosDto> getAllPlanPagosByCreditos(Long numCredito)
    {
        List<PlanPagos> planPagos=planPagosDtoRepository.findAllByNumCredito(numCredito);
        return planPagos.stream().map((planPagos1)->modelMapper.map(planPagos1,PlanPagosDto.class))
                        .collect(Collectors.toList());
    }
}
