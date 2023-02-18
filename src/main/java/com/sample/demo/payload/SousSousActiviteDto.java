package com.sample.demo.payload;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SousSousActiviteDto {

    private String id;
    private String codActividad;
    private String codSousActivite;
    private String DES_SUBSUBACTIV;
}
