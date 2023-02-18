package com.sample.demo.service;

import com.sample.demo.payload.SousActiviteDto;

import java.util.List;

public interface SousActiviteService {

    List<SousActiviteDto> getAllSousActivite();

    List<SousActiviteDto> getAllSousActiviteByActivite(String codActividad);
}
