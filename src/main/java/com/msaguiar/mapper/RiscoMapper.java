package com.msaguiar.mapper;

import org.springframework.stereotype.Service;

import com.msaguiar.domain.Risco;
import com.msaguiar.dto.RiscoDTO;

@Service
public class RiscoMapper implements Mapper<RiscoDTO, Risco> {

	@Override
	public RiscoDTO mapper(Risco risco) {

		// TaxaJuros - nao houve a necessidade de transformar
		if (risco == null) {
			return null;
		}

		RiscoDTO dto = new RiscoDTO();
		dto.setId(risco.getId());
		dto.setNome(risco.getNome());
		return dto;
	}

}
