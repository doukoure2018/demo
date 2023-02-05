package com.sample.demo.service.impl;

import com.sample.demo.entity.SG_USUARIOS;
import com.sample.demo.payload.SG_USUARIOSDto;
import com.sample.demo.payload.SG_USUARIOSResponse;
import com.sample.demo.repository.UsuarioRepository;
import com.sample.demo.service.SG_USUARIOSService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SG_USUARIOSServiceImpl implements SG_USUARIOSService {
    private UsuarioRepository usuarioRepository;
    private ModelMapper mapper;

    public SG_USUARIOSServiceImpl(UsuarioRepository usuarioRepository, ModelMapper mapper) {
        this.usuarioRepository = usuarioRepository;
        this.mapper = mapper;
    }

    @Override
    public SG_USUARIOSDto createUsuarios(SG_USUARIOSDto sg_usuariosDto) {
        return null;
    }

    @Override
    public SG_USUARIOSResponse getAllUsuarios(int pageNo, int pageSize, String sortBy, String sortDir) {
        Sort sort=sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortBy).ascending()
                :Sort.by(sortBy).descending();
        // create pageable instance
        Pageable pageable = PageRequest.of(pageNo,pageSize,sort);
        // Get all creditos from database
        Page<SG_USUARIOS> sg_usuarios=usuarioRepository.findAll(pageable);
        List<SG_USUARIOS> listOfUsuarios=sg_usuarios.getContent();
        List<SG_USUARIOSDto> content=listOfUsuarios.stream().map(usuarios -> mapToDTO(usuarios)).collect(Collectors.toList());
        SG_USUARIOSResponse sg_usuariosResponse=new SG_USUARIOSResponse();
        sg_usuariosResponse.setContent(content);
        sg_usuariosResponse.setPageNo(sg_usuarios.getNumber());
        sg_usuariosResponse.setPageSize(sg_usuarios.getSize());
        sg_usuariosResponse.setTotalElements(sg_usuarios.getTotalElements());
        sg_usuariosResponse.setTotalPages(sg_usuarios.getTotalPages());
        sg_usuariosResponse.setLast(sg_usuarios.isLast());
        return sg_usuariosResponse;
    }

    @Override
    public SG_USUARIOSDto getUsuarios(String id) {
        return null;
    }

    @Override
    public SG_USUARIOSDto updateUsuarios(SG_USUARIOSDto sg_usuariosDto, String id) {
        return null;
    }

    @Override
    public void deleteUsuario(String id) {

    }

    // convert Entity into DTO
    private SG_USUARIOSDto mapToDTO(SG_USUARIOS usuarios){
        SG_USUARIOSDto sg_usuariosDto = mapper.map(usuarios, SG_USUARIOSDto.class);
        return sg_usuariosDto;
    }

    // convert DTO to entity
    private SG_USUARIOS mapToEntity(SG_USUARIOSDto sg_usuariosDto){
        SG_USUARIOS sg_usuarios = mapper.map(sg_usuariosDto, SG_USUARIOS.class);
        return sg_usuarios;
    }
}
