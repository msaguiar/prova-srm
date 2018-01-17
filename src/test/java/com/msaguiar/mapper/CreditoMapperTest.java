package com.msaguiar.mapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.msaguiar.domain.Credito;
import com.msaguiar.dto.CreditoDTO;
import com.msaguiar.utils.RandomUtils;

public class CreditoMapperTest {

	@Test
	public void evitaNPE() {

		CreditoDTO dto = null;
		CreditoMapper mapper = new CreditoMapper();

		Credito credito = mapper.mapper(dto);

		assertNull(credito);

	}

	@Test
	public void garanteTransformacaodoDTO() {

		CreditoDTO dto = new CreditoDTO();
		dto.setId(RandomUtils.getRandomLong());
		dto.setLimite(RandomUtils.getRandomBigDecimal());
		dto.setNomeCliente(RandomUtils.getRandomString());

		CreditoMapper mapper = new CreditoMapper();

		Credito credito = mapper.mapper(dto);

		assertEquals(credito.getId(), dto.getId());

		assertEquals(credito.getLimite(), dto.getLimite());
		assertEquals(credito.getNomeCliente(), dto.getNomeCliente());

	}

}
