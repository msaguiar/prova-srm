package com.msaguiar.mapper;

import org.springframework.stereotype.Service;

import com.msaguiar.domain.Credito;
import com.msaguiar.dto.CreditoDTO;

@Service
public class CreditoMapper implements Mapper<Credito, CreditoDTO> {

	@Override
	public Credito mapper(CreditoDTO dto) {
		
		//TaxaJuros - nao houve a necessidade de transformar
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
