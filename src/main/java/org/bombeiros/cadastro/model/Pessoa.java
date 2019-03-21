package org.bombeiros.cadastro.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Pessoa {
	
	@Id
	private Long id;
	
	private String nome;

}
