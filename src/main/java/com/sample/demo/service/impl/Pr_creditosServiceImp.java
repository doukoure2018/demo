package com.sample.demo.service.impl;

import com.sample.demo.entity.Pr_credito;
import com.sample.demo.payload.Pr_creditoDto;
import com.sample.demo.repository.Pr_creditosRepository;
import com.sample.demo.service.Pr_creditosService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class Pr_creditosServiceImp implements Pr_creditosService {

    private Pr_creditosRepository creditosRepository;
    private ModelMapper mapper;

    public Pr_creditosServiceImp(Pr_creditosRepository creditosRepository, ModelMapper mapper) {
        this.creditosRepository = creditosRepository;
        this.mapper = mapper;
    }

    @Override
    public Pr_creditoDto createCreditos(Pr_creditoDto pr_creditoDto) {
        // I am to get the last num_credito
        Pr_credito pr_credito=creditosRepository.findTopByOrderByIdDesc();
        Pr_creditoDto pr_creditoDto1=mapToDto(pr_credito);
        pr_creditoDto1.setId(pr_creditoDto1.getId()+1);

        pr_creditoDto.setId(pr_creditoDto1.getId());

        Pr_credito pr_credito1=mapToEntity(pr_creditoDto);
        Pr_credito newCredito=creditosRepository.save(pr_credito1);
        Pr_creditoDto creditoResponse=mapToDto(newCredito);
        return creditoResponse;
    }

    @Override
    public List<Pr_creditoDto> getAllCreditosByUsuarios(String codUsuarios) {
        List<Pr_credito> pr_creditos=creditosRepository.findByCodUsuarios(codUsuarios);
        return pr_creditos.stream().map(creditos->mapToDto(creditos)).collect(Collectors.toList());
    }

    @Override
    public Pr_creditoDto getCreditos(Long creditosId, String usuariosId) {
        return null;
    }

    @Override
    public Pr_creditoDto getMaxRowCredito() {
        Pr_credito pr_credito=creditosRepository.findTopByOrderByIdDesc();
        Pr_creditoDto pr_creditoDto=mapToDto(pr_credito);
        pr_creditoDto.setId(pr_creditoDto.getId()+1);
        System.out.println("Max num_credito:"+pr_creditoDto.getId());
        return mapToDto(pr_credito);
    }

    @Override
    public Pr_creditoDto updateCreditos(Long creditosId, Long usuariosId, Pr_creditoDto pr_creditoDto) {
        return null;
    }

    @Override
    public void deleteCreditos(long creditosId, long usuariosId) {

    }

    //Convert Entity into Dto
    private Pr_creditoDto mapToDto(Pr_credito pr_credito){
        Pr_creditoDto pr_creditoDto =mapper.map(pr_credito, Pr_creditoDto.class);
        return pr_creditoDto;
    }

    // Convert Dto into Entity
    private Pr_credito mapToEntity(Pr_creditoDto pr_creditoDto)
    {
        Pr_credito pr_credito =mapper.map(pr_creditoDto, Pr_credito.class);
        return pr_credito;
    }
}
