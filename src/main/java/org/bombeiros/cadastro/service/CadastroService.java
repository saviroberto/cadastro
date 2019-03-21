package org.bombeiros.cadastro.service;

import java.util.List;

import org.bombeiros.cadastro.model.Pessoa;
import org.bombeiros.cadastro.repository.PessoasRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CadastroService {

	private final PessoasRepository pessoasRepository;

	public List<Pessoa> listarTodasAsPessoas() {
		return (List<Pessoa>) pessoasRepository.findAll();
	}

	public void cadastrarPessoasParaTeste() {
		for (int i = 0; i < 100; i++) {
			Pessoa pessoa = new Pessoa();
			pessoa.setId(Long.valueOf(i));
			pessoa.setNome("Nome" + i);
			pessoasRepository.save(pessoa);
		}
	}

}
