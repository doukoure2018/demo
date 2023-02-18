package com.sample.demo.repository;

import com.sample.demo.entity.Pr_credito;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Pr_creditosRepository extends JpaRepository<Pr_credito,Long> {
   List<Pr_credito> findByCodUsuarios(String codUsuarios);
   Pr_credito findTopByOrderByIdDesc();

   List<Pr_credito> findAllByCodCliente(String codCliente);
}
