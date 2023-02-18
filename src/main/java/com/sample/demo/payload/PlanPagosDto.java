package com.sample.demo.payload;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PlanPagosDto {

    private String codAgencia;
    private Long numCredito;
    private Long NUM_CUOTA;
    private Date FEC_CUOTA;
    private Date FEC_REAL_CUOTA;
    private String DIA_PAGO;
    private String TIP_CUOTA;
    private Date FEC_CANCELACION;
    private Date FEC_ULT_PAGO_MORA;
    private Date FEC_PRORROGA;
    private Long MON_CUOTA;
    private Long MON_PRINCIPAL;
    private Long MON_INT;
    private Long MON_COMISION;
    private Long SAL_PRINCIPAL;
    private Long SAL_INT;
    private Long SAL_COMISION;
    private Long SAL_CREDITO;
    private Long TAS_INT;
    private String NUM_RECIBO;
    private Long DIA_INT;
    private Long DIA_PENDIENTES_INT;
    private Long MON_POLIZA;
    private Long SAL_POLIZA;
    private String TIP_COMISION;
    private Long POR_COMISION;
    private Long DIA_PRINCIPAL;
    private Long DIA_PENDIENTES_PRINCIPAL;
    private Long DIA_COMISION;
    private Long DIA_PENDIENTES_COMISION;
    private String PER_CUOTA;
    private String PER_INT;
    private String PER_COMISION;
    private String IND_ESTADO;
    private Long MON_AHORRO;
}
