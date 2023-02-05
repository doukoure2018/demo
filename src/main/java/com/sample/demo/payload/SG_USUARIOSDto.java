package com.sample.demo.payload;

import lombok.Data;

import java.util.Date;
import java.util.Set;

@Data
public class SG_USUARIOSDto {

    private String COD_USUARIO;
    private String COD_EMPRESA;
    private String COD_AGENCIA;
    private String COD_PUESTO;
    private String NOM_USUARIO;
    private String IND_ACTIVO;
    private Date FEC_INGRESO;
    private String IND_PRINCIPIANTE;
    private String PALABRA_PASO;
    private String TIP_USUARIO;
    private String TIP_FUNCION;
    private String NIVEL_FUNCION;
    private String TIPO_ACCESO;
    private Date FEC_VENC_USUARIO;
    private Date FEC_VENC_PALABRA_PASO;
    private String COD_USUARIO_BD;
    private String PALABRA_PASO_BD;
    private String COD_IDIOMA;

    //private Set<Pr_creditoDto> pr_creditoDtos;
}
