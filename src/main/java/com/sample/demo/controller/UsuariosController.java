package com.sample.demo.controller;

import com.sample.demo.payload.SG_USUARIOSResponse;
import com.sample.demo.service.SG_USUARIOSService;
import com.sample.demo.utils.AppConstants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UsuariosController {

    private SG_USUARIOSService sg_usuariosService;

    public UsuariosController(SG_USUARIOSService sg_usuariosService) {
        this.sg_usuariosService = sg_usuariosService;
    }

    @GetMapping("/digi-crg/v1/usuarios")
    public SG_USUARIOSResponse getAllUsuarios(
            @RequestParam(value = "pageNo", defaultValue = AppConstants.DEFAULT_PAGE_NUMBER, required = false) int pageNo,
            @RequestParam(value = "pageSize", defaultValue = AppConstants.DEFAULT_PAGE_SIZE, required = false) int pageSize,
            @RequestParam(value = "sortBy", defaultValue = AppConstants.DEFAULT_SORT_BY, required = false) String sortBy,
            @RequestParam(value = "sortDir", defaultValue = AppConstants.DEFAULT_SORT_DIRECTION, required = false) String sortDir
    )
    {
        return sg_usuariosService.getAllUsuarios(pageNo,pageSize,sortBy,sortDir);
    }


}
