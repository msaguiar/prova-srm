package com.msaguiar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.msaguiar.domain.Risco;

@Repository
public interface RiscoRepository extends JpaRepository<Risco, Long> {
}
