package com.bmveiga.banklineapi.service;

import java.time.LocalDateTime;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmveiga.banklineapi.dto.MovimentacaoDTO;
import com.bmveiga.banklineapi.model.Correntista;
import com.bmveiga.banklineapi.model.Movimentacao;
import com.bmveiga.banklineapi.model.enums.MovimentacaoEnums;
import com.bmveiga.banklineapi.repository.CorrentistaRepository;
import com.bmveiga.banklineapi.repository.MovimentacaoRepository;

@Service
public class MovimentacaoService {
	
	@Autowired
	private MovimentacaoRepository repository;

	@Autowired
	private CorrentistaRepository correntistaRepository;
	
	public void save(MovimentacaoDTO novaMovimentacao) {
		Movimentacao movimentacao = new Movimentacao();

		Double valor = novaMovimentacao.getTipo() == MovimentacaoEnums.RECEITA ? novaMovimentacao.getValor()
				: novaMovimentacao.getValor() * -1;
		movimentacao.setDataHora(LocalDateTime.now());
		movimentacao.setDescricao(novaMovimentacao.getDescricao());
		movimentacao.setIdConta(novaMovimentacao.getIdConta());
		movimentacao.setTipo(novaMovimentacao.getTipo());
		movimentacao.setValor(valor);
		
		Correntista correntista = correntistaRepository.findById(novaMovimentacao.getIdConta()).orElse(null);
		
		if(correntista != null) {
			correntista.getConta().setSaldo(correntista.getConta().getSaldo() + valor);
			correntistaRepository.save(correntista);
		}
		repository.save(movimentacao);
	}
}
