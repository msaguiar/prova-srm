package com.msaguiar.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.msaguiar.dto.RiscoDTO;
import com.msaguiar.mapper.RiscoMapper;
import com.msaguiar.repository.RiscoRepository;

@Service
@Transactional
public class RiscoService {

	private final RiscoRepository riscoRepository;
	private RiscoMapper riscoMapper;

	public RiscoService(RiscoRepository riscoRepository,RiscoMapper ricoMapper) {
		this.riscoRepository = riscoRepository;
		this.riscoMapper = ricoMapper;
	}

	public List<RiscoDTO> listar() {

		return riscoMapper.mapper(riscoRepository.findAll());

	}

}
