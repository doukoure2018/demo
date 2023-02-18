package com.sample.demo.service;

import com.sample.demo.payload.SG_USUARIOSDto;
import com.sample.demo.payload.SG_USUARIOSResponse;

public interface SG_USUARIOSService {

    SG_USUARIOSDto createUsuarios(SG_USUARIOSDto sg_usuariosDto);

    SG_USUARIOSResponse getAllUsuarios(int pageNo, int pageSize, String sortBy, String sortDir);

    SG_USUARIOSDto getUsuarios(String id);

    SG_USUARIOSDto updateUsuarios(SG_USUARIOSDto sg_usuariosDto,String id);

    void deleteUsuario(String id);
}
