package com.sample.demo.repository;

import com.sample.demo.entity.SousSousActivite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SousSousActiviteRepository extends JpaRepository<SousSousActivite,String> {

    List<SousSousActivite> findAllByCodSousActivite(String codSousActivite);
}
