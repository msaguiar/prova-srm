package com.msaguiar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.msaguiar.domain.Credito;

@Repository
public interface CreditoRepository extends JpaRepository<Credito, Long> {
}
