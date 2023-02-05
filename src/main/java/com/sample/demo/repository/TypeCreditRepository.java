package com.sample.demo.repository;

import com.sample.demo.entity.TypeCredit;
import com.sample.demo.payload.TypeCreditDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeCreditRepository extends JpaRepository<TypeCredit,Long> {

}
