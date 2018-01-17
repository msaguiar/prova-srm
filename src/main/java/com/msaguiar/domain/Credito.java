package com.msaguiar.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "credito")
public class Credito implements Serializable {

	private static final long serialVersionUID = 6771233639494423606L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
	@SequenceGenerator(name = "sequenceGenerator")
	private Long id;

	@Column(nullable = false)
	private BigDecimal limite;

	@Column(nullable = false)
	private BigDecimal taxaJuros;

	@Size(min = 1, max = 50)
	@Column(length = 50, unique = true, nullable = false)
	private String nomeCliente;

	public Long getId() {
		return id;
	}

	public BigDecimal getLimite() {
		return limite;
	}

	public BigDecimal getTaxaJuros() {
		return taxaJuros;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setLimite(BigDecimal limite) {
		this.limite = limite;
	}

	public void setTaxaJuros(BigDecimal taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

}
