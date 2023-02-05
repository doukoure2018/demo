package com.sample.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "CL_CLIENTES",schema = "CL")
public class Clientes {

    @Id
    @Column(name = "COD_CLIENTE")
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
