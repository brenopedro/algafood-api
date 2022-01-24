package com.algaworks.algafood.api.model.input;

import java.math.BigDecimal;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProdutoInput {

	@ApiModelProperty(example = "Camarão ao alho e óleo", required = true)
	@NotBlank
	private String nome;

	@ApiModelProperty(example = "Camarões frescos fritados com azeite e alho até o ponto ideal", required = true)
	@NotBlank
	private String descricao;

	@ApiModelProperty(example = "10.3", required = true)
	@NotNull
	@PositiveOrZero
	private BigDecimal preco;

	@ApiModelProperty(example = "true", required = true)
	@NotNull
	private Boolean ativo;
	
}
