package com.algaworks.algafood.api.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FotoProdutoModel {

	@ApiModelProperty(example = "family.png")
	private String nomeArquivo;

	@ApiModelProperty(example = "Foto em família")
	private String descricao;

	@ApiModelProperty(example = "image/jpg")
	private String contentType;

	@ApiModelProperty(example = "1024")
	private Long tamanho;
	
}
