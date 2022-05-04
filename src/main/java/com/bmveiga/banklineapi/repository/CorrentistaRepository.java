package com.bmveiga.banklineapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bmveiga.banklineapi.model.Correntista;

public interface CorrentistaRepository extends JpaRepository<Correntista, Integer> {

}
