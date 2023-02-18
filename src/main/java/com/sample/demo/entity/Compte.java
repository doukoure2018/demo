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
@Table(name = "CC_CUENTA_EFECTIVO",schema = "CC")
public class Compte {

    @Id
    @Column(name = "NUM_CUENTA")
    private String id;
    private String COD_CATEGORIA;
    @Column(name = "COD_CLIENTE",nullable = false)
    private String codClient;
}
