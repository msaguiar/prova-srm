package com.msaguiar.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.msaguiar.domain.Credito;
import com.msaguiar.domain.Risco;
import com.msaguiar.dto.CreditoDTO;
import com.msaguiar.mapper.CreditoMapper;
import com.msaguiar.repository.CreditoRepository;
import com.msaguiar.repository.RiscoRepository;

@Service
@Transactional
public class CreditoService {

	private final CreditoRepository creditoRepository;
	private CreditoMapper creditoMapper;
	private RiscoRepository riscoRepository;

	public CreditoService(CreditoRepository creditoRepository, RiscoRepository riscoRepository,
			CreditoMapper creditoMapper) {
		this.creditoRepository = creditoRepository;
		this.creditoMapper = creditoMapper;
		this.riscoRepository = riscoRepository;
	}

	public void cadastrar(CreditoDTO creditoDTO) {
		long riscoId = creditoDTO.getRiscoId();
		Risco risco = riscoRepository.findOne(riscoId);
		if (risco == null) {
			throw new RuntimeException();
		}

		Credito credito = creditoMapper.mapper(creditoDTO);
		if (credito != null) {

			credito.setTaxaJuros(risco.getTaxaJuros());
			creditoRepository.save(credito);
		}

	}

}
