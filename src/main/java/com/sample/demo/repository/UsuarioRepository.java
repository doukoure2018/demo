package com.sample.demo.repository;

import com.sample.demo.entity.SG_USUARIOS;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<SG_USUARIOS,String> {
}
