package com.sample.demo.repository;

import com.sample.demo.entity.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompteRepository extends JpaRepository<Compte,String> {

    List<Compte> findAllByCodClient(String codClient);
}
