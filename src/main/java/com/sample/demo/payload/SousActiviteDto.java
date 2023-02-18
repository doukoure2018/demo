package com.sample.demo.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SousActiviteDto{

    private String id;
    private String COD_ACTIVIDAD;
    private String DES_SUBACTIV;
}
