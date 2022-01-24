package com.algaworks.algafood.api.model;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProdutoModel {

	@ApiModelProperty(example = "1")
	private Long id;

	@ApiModelProperty(example = "Camarão ao alho e óleo")
	private String nome;

	@ApiModelProperty(example = "Camarões frescos fritados com azeite e alho até o ponto ideal")
	private String descricao;

	@ApiModelProperty(example = "10.3")
	private BigDecimal preco;

	@ApiModelProperty(example = "true")
	private Boolean ativo;
	
}
