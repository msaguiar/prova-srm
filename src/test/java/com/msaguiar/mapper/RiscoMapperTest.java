package com.msaguiar.mapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.msaguiar.domain.Risco;
import com.msaguiar.dto.RiscoDTO;
import com.msaguiar.utils.RandomUtils;

public class RiscoMapperTest {

	@Test
	public void evitaNPE() {

		Risco dto = null;
		RiscoMapper mapper = new RiscoMapper();

		RiscoDTO risco = mapper.mapper(dto);

		assertNull(risco);

	}

	@Test
	public void garanteTransformacaodoDoDomain() {

		Risco risco = new Risco();

		risco.setId(RandomUtils.getRandomLong());
		risco.setNome(RandomUtils.getRandomString());

		RiscoMapper mapper = new RiscoMapper();

		RiscoDTO dto = mapper.mapper(risco);

		assertEquals(dto.getId(), risco.getId());
		assertEquals(dto.getNome(), risco.getNome());

	}

}
