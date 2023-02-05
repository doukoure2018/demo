package com.sample.demo.repository;

import com.sample.demo.entity.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository extends JpaRepository<Clientes,String> {

    Clientes findTopByOrderByIdDesc();

    boolean existsById(String id);
}
