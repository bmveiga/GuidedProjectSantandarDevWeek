package com.bmveiga.banklineapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bmveiga.banklineapi.dto.CorrentistaDTO;
import com.bmveiga.banklineapi.model.Correntista;
import com.bmveiga.banklineapi.repository.CorrentistaRepository;
import com.bmveiga.banklineapi.service.CorrentistaService;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {
	
	@Autowired
	private CorrentistaRepository repository;
	
	@Autowired
	private CorrentistaService correntistaService;
	
	@GetMapping
	public List<Correntista> findAll(){
		return repository.findAll(); 
	}
	
	@PostMapping
	public void save(@RequestBody CorrentistaDTO correntista) {
		correntistaService.save(correntista);
	}
	
	
}
