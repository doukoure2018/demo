package com.sample.demo.payload;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ClientesDto {

    private String id;
    private String COD_EMPRESA;
    private String CAT_CLIENTE;
    private String NOM_CLIENTE;
    private String IND_PERSONA;
    private Date FEC_INGRESO;
    private String TEL_PRINCIPAL;
    private String TEL_SECUNDARIO;
    private String TEL_OTRO;
    private String IND_RELACION;
    private String COD_AGENCIA;
}
