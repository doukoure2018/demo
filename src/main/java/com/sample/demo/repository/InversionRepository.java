package com.sample.demo.repository;

import com.sample.demo.entity.Inversion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InversionRepository extends JpaRepository<Inversion,String> {
}
