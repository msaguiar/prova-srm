package com.msaguiar.mapper;

import org.springframework.stereotype.Service;

import com.msaguiar.domain.Credito;
import com.msaguiar.dto.CreditoDTO;

@Service
public class CreditoMapper extends AbstractMapper<Credito, CreditoDTO> {

	@Override
	public Credito mapper(CreditoDTO dto) {
		if (dto == null) {
			return null;
		}

		Credito credito = new Credito();
		credito.setId(dto.getId());
		credito.setNomeCliente(dto.getNomeCliente());
		credito.setLimite(dto.getLimite());
		return credito;

	}

}
