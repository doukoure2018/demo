package com.sample.demo.service;

import com.sample.demo.payload.Pr_creditoDto;

import java.util.List;

public interface Pr_creditosService {

    Pr_creditoDto createCreditos(Pr_creditoDto pr_creditoDto);

    List<Pr_creditoDto> getAllCreditosByUsuarios(String codUsuarios);
    Pr_creditoDto getCreditos(Long creditosId,String usuariosId);

    Pr_creditoDto getMaxRowCredito();

    Pr_creditoDto updateCreditos(Long creditosId,Long usuariosId,Pr_creditoDto pr_creditoDto);

    void deleteCreditos(long creditosId,long usuariosId);
}
