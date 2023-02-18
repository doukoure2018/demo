package com.sample.demo.repository;

import com.sample.demo.entity.Charges;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChargesRepository extends JpaRepository<Charges,String> {
}
