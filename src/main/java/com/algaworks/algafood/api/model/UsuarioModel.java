package com.algaworks.algafood.api.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UsuarioModel {

	@ApiModelProperty(example = "1")
	private Long id;

	@ApiModelProperty(example = "João da Silta")
	private String nome;

	@ApiModelProperty(example = "joaosilva@homail.com")
	private String email;
	
}
