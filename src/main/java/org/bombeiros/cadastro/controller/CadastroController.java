package org.bombeiros.cadastro.controller;

import java.util.List;

import org.bombeiros.cadastro.model.Pessoa;
import org.bombeiros.cadastro.service.CadastroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class CadastroController {

	private final CadastroService cadastroService;

	@RequestMapping(path = "pessoas", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Pessoa>> pessoas() {
		cadastroService.cadastrarPessoasParaTeste();
		List<Pessoa> pessoas = cadastroService.listarTodasAsPessoas();
		ResponseEntity<List<Pessoa>> response = new ResponseEntity<List<Pessoa>>(pessoas, HttpStatus.OK);
		return response;
	}
	
	@RequestMapping(path = "pessoa", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> cadastrarPessoa(@RequestBody String pessoa) {
		System.out.println(pessoa);
		ResponseEntity<String> response = new ResponseEntity<String>("BOA", HttpStatus.OK);
		return response;
	}
}
