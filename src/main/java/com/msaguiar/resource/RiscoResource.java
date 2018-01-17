package com.msaguiar.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msaguiar.dto.RiscoDTO;
import com.msaguiar.service.RiscoService;

@RestController
@RequestMapping("/api/risco")
public class RiscoResource {

	private RiscoService riscoService;

	public RiscoResource(RiscoService riscoService) {
		this.riscoService = riscoService;
	}

	@GetMapping("/listar")
	public List<RiscoDTO> listar() {
		return riscoService.listar();
	}

}
