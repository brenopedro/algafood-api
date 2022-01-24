package com.algaworks.algafood.api.exceptionhandler;

import java.time.OffsetDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;

@ApiModel("Problema")
@JsonInclude(Include.NON_NULL)
@Getter
@Builder
public class Problem {

	@ApiModelProperty(example = "400")
	private Integer status;
	
	@ApiModelProperty(example = "2019-12-01T18:09:02.70844Z")
	private OffsetDateTime timestamp;
	
	@ApiModelProperty(example = "https://algaood.com.br/dados-invalidos")
	private String type;
	
	@ApiModelProperty(example = "Dados inválidos")
	private String title;
	private String detail;
	private String userMessage;
	
	@ApiModelProperty("Lista de objetos ou campos que geraram o erro (opcional)")
	private List<Object> objects;

	@ApiModel("ObjetoProblema")
	@Getter
	@Builder
	public static class Object {
		
		@ApiModelProperty(example = "preço")
		private String name;
		
		@ApiModelProperty(example = "O preço é obrigatório")
		private String userMessage;
		
	}
	
}
