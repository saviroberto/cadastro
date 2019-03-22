package org.bombeiros.cadastro.repository;

import java.util.List;

import org.bombeiros.cadastro.model.Pessoa;
import org.springframework.data.repository.CrudRepository;

public interface PessoasRepository extends CrudRepository<Pessoa, Long> {

	List<Pessoa> findByNomeContainingIgnoreCase(String nome);

}
