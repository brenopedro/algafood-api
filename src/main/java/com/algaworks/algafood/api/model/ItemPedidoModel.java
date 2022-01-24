package com.algaworks.algafood.api.model;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemPedidoModel {

	@ApiModelProperty(example = "1")
	private Long produtoId;

	@ApiModelProperty(example = "Sushi")
	private String produtoNome;

	@ApiModelProperty(example = "12")
	private Integer quantidade;

	@ApiModelProperty(example = "12.30")
	private BigDecimal precoUnitario;

	@ApiModelProperty(example = "123.31")
	private BigDecimal precoTotal;

	@ApiModelProperty(example = "Sem cebola")
	private String observacao;
	
}
