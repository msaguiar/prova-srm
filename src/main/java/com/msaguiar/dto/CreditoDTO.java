package com.msaguiar.dto;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class CreditoDTO {

	private Long id;

	@NotBlank
	@Size(min = 1, max = 50)
	private String nomeCliente;

	@NotNull
	private long riscoId;

	@NotNull
	private BigDecimal limite;

	public Long getId() {
		return id;
	}

	public BigDecimal getLimite() {
		return limite;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setLimite(BigDecimal limite) {
		this.limite = limite;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public long getRiscoId() {
		return riscoId;
	}

	public void setRiscoId(long riscoId) {
		this.riscoId = riscoId;
	}

}
