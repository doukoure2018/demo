package com.sample.demo.service.impl;

import com.sample.demo.entity.Clientes;
import com.sample.demo.exception.ResourceNotFoundException;
import com.sample.demo.payload.ClientesDto;
import com.sample.demo.payload.ClientesResponse;
import com.sample.demo.repository.ClientesRepository;
import com.sample.demo.service.ClientesService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientesServiceImpl implements ClientesService {

    private ClientesRepository clientesRepository;
    private ModelMapper mapper;

    public ClientesServiceImpl(ClientesRepository clientesRepository, ModelMapper mapper) {
        this.clientesRepository = clientesRepository;
        this.mapper = mapper;
    }

    @Override
    public ClientesDto createClientes(ClientesDto clientesDto,String cod_agence) {
        // get the last clientes
        Clientes lastClientes=clientesRepository.findTopByOrderByIdDesc();
        ClientesDto lastClientesDto=mapToDTO(lastClientes);
        System.out.println("The last number"+lastClientesDto.getId());
        String newCompteClientes=incrementLastNumber(lastClientesDto.getId(),cod_agence);

        lastClientesDto.setId(newCompteClientes);
        // Je met a jour Id du prochain cod_client
        clientesDto.setId(lastClientesDto.getId());
        clientesDto.setCOD_AGENCIA(cod_agence);

        Clientes clientes=mapToEntity(clientesDto);
        Clientes newClientes=clientesRepository.save(clientes);
        ClientesDto responseDto=mapToDTO(newClientes);
        return responseDto;
    }

    @Override
    public ClientesResponse getAllClientes(int pageNo, int pageSize, String sortBy, String sortDir) {
        Sort sort=sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortBy).ascending()
                :Sort.by(sortBy).descending();
        // create Pageable instance
        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
        Page<Clientes> allClientes=clientesRepository.findAll(pageable);
        List<Clientes> listOfClientes=allClientes.getContent();
        List<ClientesDto> content=listOfClientes.stream().map(clientes -> mapToDTO(clientes)).collect(Collectors.toList());
        ClientesResponse clientesResponse=new ClientesResponse();
        clientesResponse.setContent(content);
        clientesResponse.setPageNo(allClientes.getNumber());
        clientesResponse.setPageSize(allClientes.getSize());
        clientesResponse.setTotalElements(allClientes.getTotalElements());
        clientesResponse.setTotalPages(allClientes.getTotalPages());
        clientesResponse.setLast(allClientes.isLast());

        return clientesResponse;
    }

    @Override
    public ClientesDto getClientes(String id) {
        Clientes clientes=clientesRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Clientes","id",id));
        return mapToDTO(clientes);
    }

    @Override
    public ClientesDto updateClientes(ClientesDto clientesDto, String id) {
        return null;
    }

    @Override
    public void deleteClientes(String id) {

    }

    // convert Entity into DTO
    private ClientesDto mapToDTO(Clientes clientes){
        ClientesDto clientesDto = mapper.map(clientes, ClientesDto.class);
        return clientesDto;
    }

    // convert DTO to entity
    private Clientes mapToEntity(ClientesDto clientesDto){
        Clientes clientes = mapper.map(clientesDto, Clientes.class);
        return clientes;
    }

    /**
     * get newCompteClientes
     * @param numComte
     * @param cod_agence
     * @return
     */
    public String incrementLastNumber(String numComte,String cod_agence)
    {
        int count=0;
        for (int i=0;i<numComte.length();i++)
        {
            if(numComte.charAt(i)!=' '){
                count++;
            }
        }
        // je recupere les derniers puis je fais l'incrementation
        String newLastCompte=numComte.substring(3,count);
        int incrementLastNomber=Integer.parseInt(newLastCompte)+1;
        String newCompteClientes=cod_agence+Integer.toString(incrementLastNomber);
        return newCompteClientes;
    }
}
