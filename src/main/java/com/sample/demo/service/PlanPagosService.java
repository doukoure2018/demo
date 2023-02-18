package com.sample.demo.service;

import com.sample.demo.entity.PlanPagos;
import com.sample.demo.payload.PlanPagosDto;

import java.util.List;

public interface PlanPagosService {

    List<PlanPagosDto> getAllPlanPagosByCreditos(Long numCredito);
}
