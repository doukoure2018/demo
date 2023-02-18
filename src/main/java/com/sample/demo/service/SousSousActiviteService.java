package com.sample.demo.service;

import com.sample.demo.payload.SousSousActiviteDto;

import java.util.List;

public interface SousSousActiviteService {

    List<SousSousActiviteDto> getAllSousSousActivite();

    List<SousSousActiviteDto> getAllSousSousActiviteByCod(String codSousActivite);
}
