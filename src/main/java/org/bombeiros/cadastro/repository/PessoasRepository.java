package org.bombeiros.cadastro.repository;

import org.bombeiros.cadastro.model.Pessoa;
import org.springframework.data.repository.CrudRepository;

public interface PessoasRepository extends CrudRepository<Pessoa, Long> {

}
