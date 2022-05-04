package com.bmveiga.banklineapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bmveiga.banklineapi.dto.MovimentacaoDTO;
import com.bmveiga.banklineapi.model.Correntista;
import com.bmveiga.banklineapi.model.Movimentacao;
import com.bmveiga.banklineapi.repository.MovimentacaoRepository;
import com.bmveiga.banklineapi.service.MovimentacaoService;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {
	
	@Autowired
	private MovimentacaoRepository repository;
	
	@Autowired
	private MovimentacaoService movimentacaoService;
	
	@GetMapping
	public List<Movimentacao> findAll(){
		return repository.findAll(); 
	}
	
	@PostMapping
	public void save(@RequestBody MovimentacaoDTO movimentacao) {
		movimentacaoService.save(movimentacao);
	}
	
	
}
