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
	private String sexo ;
	private String socorrista; 
	private String rg ;
	private String graduacao ;
	private String nomeDeGuerra; 
	private String modeloCapa; 
	private String condicaoCapa ;
	private String tamanhoCapaQueTem ;
	private String tamanhoCapaQueUsa; 
	private String modeloCalca ;
	private String condicaoCalca ;
	private String tamanhoCalcaQueTem; 
	private String tamanhoCalcaQueUsa; 
	private String modeloBota; 
	private String condicaoBota ;
	private String tamanhoBotaQueTem ;
	private String tamanhoBotaQueUsa; 
	private String modeloCapacete; 
	private String condicaoCapacete; 
	private String numeroCapacete; 
	private String modeluva ;
	private String condicaoLuva ;
	private String tamanhoLuva ;
	private String condicaoBalaclava ;
	private String condicaoLuvaVaqueta ;
	private String tamanhoLuvaVaqueta ;
	private String condicaoOculosProtecao; 
}
