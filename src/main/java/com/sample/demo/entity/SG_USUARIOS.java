package com.sample.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "SG_USUARIOS",schema = "SG")
public class SG_USUARIOS {

    @Id
    @Column(name = "COD_USUARIO")
    private String id;
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

   // @OneToMany(mappedBy = "usuarios",cascade = CascadeType.ALL, orphanRemoval = true)
    //private Set<Pr_credito> pr_creditos=new HashSet<>();


}
