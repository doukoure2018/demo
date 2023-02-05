package com.sample.demo.repository;

import com.sample.demo.entity.Pr_credito;
import com.sample.demo.payload.Pr_creditoDto;
import org.modelmapper.internal.bytebuddy.dynamic.DynamicType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface Pr_creditosRepository extends JpaRepository<Pr_credito,Long> {
   List<Pr_credito> findByCodUsuarios(String codUsuarios);
   Pr_credito findTopByOrderByIdDesc();
}
