package com.msaguiar.service;

import static org.junit.Assert.assertEquals;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.msaguiar.domain.Risco;
import com.msaguiar.dto.RiscoDTO;
import com.msaguiar.mapper.RiscoMapper;
import com.msaguiar.repository.RiscoRepository;

public class RiscoServiceTest {

	@Mock
	private RiscoRepository riscoRepository;

	@Mock
	private RiscoMapper riscoMapper;
	
	@InjectMocks
	private RiscoService riscoService;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void garanteChamadaDoRepository() {

		List<Risco> riscos = Collections.emptyList();

		Mockito.when(riscoRepository.findAll()).thenReturn(riscos);

		Collection<RiscoDTO> riscosRetorno = riscoService.listar();

		Mockito.verify(riscoRepository).findAll();
		Mockito.verify(riscoMapper).mapper(Mockito.anyCollectionOf(Risco.class));

		assertEquals(riscos.size(), riscosRetorno.size());
	}
}
