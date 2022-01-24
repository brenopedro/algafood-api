package com.algaworks.algafood.api.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EnderecoModel {

	@ApiModelProperty(example = "50720-590")
	private String cep;

	@ApiModelProperty(example = "Rua Fidelis Moliterno")
	private String logradouro;

	@ApiModelProperty(example = "\"199\"")
	private String numero;

	@ApiModelProperty(example = "Apt 101")
	private String complemento;

	@ApiModelProperty(example = "Zumbi")
	private String bairro;

	private CidadeResumoModel cidade;
	
}
