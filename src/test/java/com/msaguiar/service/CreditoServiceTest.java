package com.msaguiar.service;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.msaguiar.domain.Credito;
import com.msaguiar.domain.Risco;
import com.msaguiar.dto.CreditoDTO;
import com.msaguiar.mapper.CreditoMapper;
import com.msaguiar.mapper.RiscoMapper;
import com.msaguiar.repository.CreditoRepository;
import com.msaguiar.repository.RiscoRepository;
import com.msaguiar.service.CreditoService;
import com.msaguiar.utils.RandomUtils;

public class CreditoServiceTest {

	@Mock
	private CreditoRepository creditoRepository;

	@Mock
	private RiscoRepository riscoRepository;

	@Mock
	private RiscoMapper riscoMapper;

	@Mock
	private CreditoMapper mapper;

	@InjectMocks
	private CreditoService creditoService;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void garanteChamadaDoRepository() {

		Long riscoId = RandomUtils.getRandomLong();
		BigDecimal taxaJuros = new BigDecimal(100);

		CreditoDTO creditoDTO = new CreditoDTO();
		creditoDTO.setLimite(RandomUtils.getRandomBigDecimal());
		creditoDTO.setRiscoId(riscoId);
		creditoDTO.setNomeCliente(RandomUtils.getRandomString());

		Credito credito = new Credito();

		Risco risco = new Risco();
		risco.setTaxaJuros(taxaJuros);
		Mockito.when(riscoRepository.findOne(riscoId)).thenReturn(risco);
		Mockito.when(mapper.mapper(creditoDTO)).thenReturn(credito);

		creditoService.cadastrar(creditoDTO);

		Mockito.verify(creditoRepository).save(credito);

		assertEquals(taxaJuros, credito.getTaxaJuros());
	}

	@Test(expected = RuntimeException.class)
	public void garanteChamadaValidacaoRiscoNaoEncontrado() {

		Long riscoId = 1l;
		BigDecimal taxaJuros = new BigDecimal(100);

		CreditoDTO creditoDTO = new CreditoDTO();
		creditoDTO.setLimite(RandomUtils.getRandomBigDecimal());
		creditoDTO.setRiscoId(RandomUtils.getRandomLong());
		creditoDTO.setNomeCliente(RandomUtils.getRandomString());

		Credito credito = new Credito();

		Risco risco = new Risco();
		risco.setTaxaJuros(taxaJuros);
		Mockito.when(riscoRepository.findOne(riscoId)).thenReturn(risco);
		Mockito.when(mapper.mapper(creditoDTO)).thenReturn(credito);

		creditoService.cadastrar(creditoDTO);

	}
}
