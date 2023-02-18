package com.sample.demo.repository;

import com.sample.demo.entity.PlanPagos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlanPagosDtoRepository extends JpaRepository<PlanPagos,String> {

    @Query(value = "SELECT * FROM PR.PR_PLAN_PAGOS p WHERE p.NUM_CREDITO=:numCredito",nativeQuery = true)
    List<PlanPagos> findAllByNumCredito(@Param("numCredito") Long numCredito);


}
