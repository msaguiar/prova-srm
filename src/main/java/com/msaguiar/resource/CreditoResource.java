package com.msaguiar.resource;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msaguiar.dto.CreditoDTO;
import com.msaguiar.service.CreditoService;

@RestController
@RequestMapping("/api/credito")
public class CreditoResource {

	private CreditoService creditoService;

	public CreditoResource(CreditoService creditoService) {
		this.creditoService = creditoService;
	}

	@PostMapping
	public ResponseEntity<Void> cadastrar(@Valid @RequestBody CreditoDTO credito) {

		creditoService.cadastrar(credito);

		return ResponseEntity.ok().build();
	}

}
