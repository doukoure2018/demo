package com.sample.demo.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "PR_CREDITOS",schema ="PR" )
public class Pr_credito {

    @Id
   // @GeneratedValue(
           // strategy = GenerationType.IDENTITY
    //)
    @Column(name ="NUM_CREDITO")
    private Long id;
    private String COD_EMPRESA;
    private String COD_AGENCIA;
    private Long TIP_CREDITO;
    private String COD_ORIGEN;
    private String COD_PLAN_INVERSION;
    private Long COD_PLAZO;
    private String COD_MONEDA;
    @Column(name = "COD_CLIENTE",nullable = false)
    private String codCliente;
    private String COD_TASA_INT;
    @Column(name = "COD_USUARIO",nullable = false)
    private String codUsuarios;
    private String COD_ACTIVIDAD;
    private String COD_SUBACTIV;
    private String COD_REFERENTE;
    private String COD_TASA_MORA;
    private Date FEC_CALIFICACION;
    private Long MON_CREDITO;
    private Long MON_SALDO;
    private String IND_LINEA;
    private String TIP_LINEA;
    private String TIP_MANEJO;
    private String TIP_MODALIDAD_COBRO;
    private String TIP_INTERES;
    private Long TIP_CALENDARIO;
    private String TIP_CUOTA;
    private Long MON_COMISION_NORMAL;
    private Long MON_CUOTA;
    private Long MON_DESEMBOLSADO;
    private Long MON_PAGADO_PRINCIPAL;
    private Long MON_PAGADO_INTERESES;
    private Long MON_INT_ACUMULADO;
    private Long MON_REVALORIZACION;
    private Long MON_INT_SUSPENSO;
    private Long PLAZO_CREDITO;
    private String ID_EXTERNO;
    private Long NUM_LINEA;
    private String TIP_TASA;
    private Long VAL_VARIACION_BASE;
    private Long TASA_INTERES;
    private Long VAL_VARIACION_MORA;
    private Long TASA_MORA;
    private Long GRACIA_PRINCIPAL;

    private Long GRACIA_MORA;
    private Date FEC_APERTURA;
    private Date FEC_VENCIMIENTO;
    private Date FEC_CANCELACION;
    private Date FEC_ULT_REVISION;
    private Date FEC_ULT_PAGO_PRINCIPAL;
    private Date FEC_ULT_PAGO_INTERESES;
    private Date FEC_PRIMER_DESEMBOLSO;
    private Date FEC_ULT_DESEMBOLSO;
    private Date FEC_PROX_COMISION;
    private Date FEC_ULT_PAGO_MORA;
    private Date FEC_RECONOC_INT;
    private String TIP_DESEMBOLSO;
    private String NUM_DESTINO;
    private String IND_CONTINUA_COBRO_INT;
    private String DIA_PAGO;
    private Date FEC_ADICION;
    private String TIP_COMISION;
    private String TIP_MORA;
    private String IND_SOBREGIRO;
    private Long POR_SOBREGIRO;
    private Date FEC_PRORROGA;
    private Date FEC_ULT_PAGO_COMISION;
    private Date FEC_PROX_REVISION;
    private Date FEC_ULT_REVISION_MORA;
    private Date FEC_INI_PAGO_PRINC;
    private String IND_COB_CARGOS;
    private String IND_COB_POLIZA;
    private String IND_COB_CUOTA;
    private String IND_COB_COMISION;
    private String TIP_REVISION;
    private Long MON_INT_MORA_ACUMULA;
    private Long MON_INT_MORA_SUSPENSO;
    private Long TIP_REG_COBRO;
    private String COD_SUBSUBACTIVIDAD;
    private String IND_ESTADO;
    private String OBSERVACIONES;
    private String PER_INT;
    private String PER_MORA;
    private String PER_COMISION;
    private String PER_CUOTA;
    private String PER_REV_TASA;
    private String COD_EJECUTIVO;
    private String IND_BLOQUEO;
    private String IND_FORMA_PAGO;
    private String ID_CUENTA;
    private String COD_OFICIAL;
    private Date FEC_ING_COBRO;
    private Date FEC_SAL_COBRO;
    private Long MON_INT_ANTICIPADOS;
    private Long MON_INT_ANTES_CJ;
    private String COD_DIRECCION;
    private String IND_CALIF_MANUAL;
    private String COD_CALIFICACION;
    private Long CANT_HECTAREAS;
    private String COD_ASOCIACION;
    private String COD_GRUPO_SOL;
    private String COD_FINANCIADOR;
    private Long NUM_CICLO;
    private String COD_ZONA;
    private String IND_TASA_VAL_AGREGADO;
    private Long TASA_INT_VAL_AGREGADO;
    private String IND_CAPITALIZA_INT;
    private String PERIODO_CAPITALIZACION;
    private Date FEC_INICIO_PLAN;
    private String IND_COBRA_INT_INICIAL;
    private Long MON_SUSPEN_INTERESES;
    private Long MON_SUSPEN_PRINCIPAL;
    private String IND_CALC_MORA;
    private Long MON_PRINCIPAL_CUOTA;
    private Long MON_INT_CUOTA;
    @Column(name = "CANT_CUOTAS",nullable = false)
    private Long CANT_CUOTAS;
    private Long PLAZO_ADICIONAL;
    private Date FEC_RENOVACION;
    private Long MON_PROVISION;
    private String IND_EXCLUSION_PAGO;
    private Date FEC_PROVISION;
    private String COD_USUARIO_PROVISION;
    private String COD_ESTADO_CONTABLE;
    private Long TASA_EFECTIVA;
    private String TIP_MODALIDAD_COBRO_ESP;

    /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COD_USUARIO",nullable = false)
    private SG_USUARIOS usuarios;*/
}
