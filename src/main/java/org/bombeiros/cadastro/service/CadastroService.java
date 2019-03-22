package org.bombeiros.cadastro.service;

import java.util.List;
import java.util.Optional;

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
			pessoa.setNome("Nome" + i);
			pessoasRepository.save(pessoa);
		}
	}

	public void salvarPessoa(Pessoa pessoa) {
		pessoasRepository.save(pessoa);
	}

	public List<Pessoa> procurarPessoaPorNome(String nome) {
		return pessoasRepository.findByNomeContainingIgnoreCase(nome);
	}

	public Pessoa procurarPessoaPorId(String id) {
		Optional<Pessoa> optionalPessoa = pessoasRepository.findById(Long.valueOf(id));
		if (optionalPessoa.isPresent()) {
			return optionalPessoa.get();
		} else {
			return new Pessoa();
		}
	}
}
