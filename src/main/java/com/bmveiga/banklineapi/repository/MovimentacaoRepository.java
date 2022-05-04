package com.bmveiga.banklineapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bmveiga.banklineapi.model.Correntista;
import com.bmveiga.banklineapi.model.Movimentacao;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer> {

}
