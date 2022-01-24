package com.algaworks.algafood.api.openapi.controller;

import com.algaworks.algafood.api.exceptionhandler.Problem;
import com.algaworks.algafood.api.model.EstadoModel;
import com.algaworks.algafood.api.model.input.EstadoInput;
import io.swagger.annotations.*;

@Api(tags = "Estados")
public interface EstadoControllerOpenApi {

    @ApiOperation("Buscar um estado por ID")
    @ApiResponses({
            @ApiResponse(code = 400, message = "ID do estado invalido", response = Problem.class),
            @ApiResponse(code = 404, message = "Estado nao encontrado", response = Problem.class),
    })
    EstadoModel buscar(@ApiParam(value = "ID de um estado", example = "1", required = true) Long estadoId);

    @ApiOperation("Cadastra um estado")
    @ApiResponses({
            @ApiResponse(code = 201, message = "Estado cadastrado")
    })
    EstadoModel adicionar(@ApiParam(name = "corpo", value = "Representacao de um novo estado", required = true)
                                  EstadoInput estadoInput);

    @ApiOperation("Atualiza um estado")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Estado atualizado"),
            @ApiResponse(code = 404, message = "Estado nao encontrado", response = Problem.class),
    })
    EstadoModel atualizar(@ApiParam(value = "ID de um estado", example = "1", required = true) Long estadoId,
                          @ApiParam(name = "corpo", value = "Representacao de um novo estado", required = true)
                                  EstadoInput estadoInput);

    @ApiOperation("Apaga um estado")
    @ApiResponses({
            @ApiResponse(code = 204, message = "Estado excluido"),
            @ApiResponse(code = 404, message = "Estado nao encontrado", response = Problem.class)
    })
    void remover(@ApiParam(value = "ID de um estado", example = "1", required = true) Long estadoId);
}
