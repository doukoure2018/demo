package com.sample.demo.payload;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CompteDto {

    private String id;
    private String COD_CATEGORIA;
    private String codClient;
}
