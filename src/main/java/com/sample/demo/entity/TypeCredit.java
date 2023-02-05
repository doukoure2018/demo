package com.sample.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "PR_TIPO_CREDITO",schema = "PR")
public class TypeCredit {

    @Id
    @Column(name = "TIP_CREDITO")
    private Long id;
    private String DES_TIP_CREDITO;

}
