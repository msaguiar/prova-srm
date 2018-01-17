package com.msaguiar.mapper;

import org.springframework.stereotype.Service;

import com.msaguiar.domain.Risco;
import com.msaguiar.dto.RiscoDTO;

@Service
public class RiscoMapper extends AbstractMapper<RiscoDTO, Risco> {

	@Override
	public RiscoDTO mapper(Risco risco) {
		if (risco == null) {
			return null;
		}

		RiscoDTO dto = new RiscoDTO();
		dto.setId(risco.getId());
		dto.setNome(risco.getNome());
		return dto;
	}

}
