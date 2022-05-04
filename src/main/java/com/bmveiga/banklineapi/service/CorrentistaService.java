package com.bmveiga.banklineapi.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmveiga.banklineapi.dto.CorrentistaDTO;
import com.bmveiga.banklineapi.model.Conta;
import com.bmveiga.banklineapi.model.Correntista;
import com.bmveiga.banklineapi.repository.CorrentistaRepository;

@Service
public class CorrentistaService {

	@Autowired
	private CorrentistaRepository repository;
	
	public void save(CorrentistaDTO novoCorrentista) {
		Correntista correntista = new Correntista(); 
		correntista.setCpf(novoCorrentista.getCpf());
		correntista.setNome(novoCorrentista.getNome());
		
		Conta conta  = new Conta();
		conta.setSaldo(0.00);
		conta.setNumero(new Date().getTime());
		
		correntista.setConta(conta);
		
		repository.save(correntista);
	}
}
