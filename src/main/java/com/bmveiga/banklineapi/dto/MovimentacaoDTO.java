package com.bmveiga.banklineapi.dto;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.bmveiga.banklineapi.model.enums.MovimentacaoEnums;

public class MovimentacaoDTO {

	private String descricao;
	private Double valor;
	private MovimentacaoEnums tipo;
	private Integer idConta;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public MovimentacaoEnums getTipo() {
		return tipo;
	}

	public void setTipo(MovimentacaoEnums tipo) {
		this.tipo = tipo;
	}

	public Integer getIdConta() {
		return idConta;
	}

	public void setIdConta(Integer idConta) {
		this.idConta = idConta;
	}

}
