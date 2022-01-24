package com.algaworks.algafood.api.model.input;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EnderecoInput {

	@ApiModelProperty(example = "50720-590", required = true)
	@NotBlank
	private String cep;

	@ApiModelProperty(example = "Rua Fidelis Moliterno", required = true)
	@NotBlank
	private String logradouro;

	@ApiModelProperty(example = "\"199\"", required = true)
	@NotBlank
	private String numero;

	@ApiModelProperty(example = "Apt 101")
	private String complemento;

	@ApiModelProperty(example = "Zumbi", required = true)
	@NotBlank
	private String bairro;
	
	@Valid
	@NotNull
	private CidadeIdInput cidade;
	
}
