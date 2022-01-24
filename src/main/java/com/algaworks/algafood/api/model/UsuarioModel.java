package com.algaworks.algafood.api.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UsuarioModel {

	@ApiModelProperty(example = "1")
	private Long id;

	@ApiModelProperty(example = "Breno Pedro")
	private String nome;

	@ApiModelProperty(example = "brenopedro@14homail.com")
	private String email;
	
}
