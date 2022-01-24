package com.algaworks.algafood.api.openapi.controller;

import com.algaworks.algafood.api.exceptionhandler.Problem;
import com.algaworks.algafood.api.model.RestauranteModel;
import com.algaworks.algafood.api.model.input.RestauranteInput;
import com.algaworks.algafood.api.openapi.model.RestauranteBasicoOpenApi;
import io.swagger.annotations.*;

import java.util.List;

@Api(tags = "Restaurantes")
public interface RestauranteControllerOpenApi {

    @ApiOperation(value = "Lista restaurantes", response = RestauranteBasicoOpenApi.class)
    @ApiImplicitParams(value = {
            @ApiImplicitParam(value = "Nome da projecao de pedidos", allowableValues = "apenas-nome",
                    name = "projecao", paramType = "query", type = "string")
    })
    List<RestauranteModel> listar();

    @ApiOperation(value = "Lista restaurantes", hidden = true)
    List<RestauranteModel> listarApenasNomes();

    @ApiOperation("Busca um restaurante por id")
    @ApiResponses({
            @ApiResponse(code = 400, message = "ID do restaurante invalido", response = Problem.class),
            @ApiResponse(code = 404, message = "Restaurante nao encontrado", response = Problem.class)
    })
    RestauranteModel buscar(@ApiParam(value = "ID de um restaurante", example = "1", required = true) Long restauranteId);

    @ApiOperation("Cadastra um restaurante")
    @ApiResponses({
            @ApiResponse(code = 201, message = "Cidade cadastrada")
    })
    RestauranteModel adicionar(@ApiParam(name = "corpo",value = "Representacao de um novo restaurante", required = true)
                                       RestauranteInput restauranteInput);

    @ApiOperation("Atualiza um restaurante")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Restaurante atualizado"),
            @ApiResponse(code = 404, message = "Restaurante nao encontrado", response = Problem.class)
    })
    RestauranteModel atualizar(@ApiParam(value = "ID um restaurante", example = "1", required = true) Long restauranteId,
                                      @ApiParam(name = "corpo", value = "Representacao de umo novo restaurante", required = true)
                                              RestauranteInput restauranteInput);
    @ApiOperation("Ativa um restaurante por ID")
    @ApiResponses({
            @ApiResponse(code = 204, message = "Restaurante ativado com sucesso"),
            @ApiResponse(code = 404, message = "Restaurante nao encontrado", response = Problem.class)
    })
    void ativar(@ApiParam(value = "ID de um restaurante", example = "1", required = true) Long restauranteId);

    @ApiOperation("Desativa um restaurante por ID")
    @ApiResponses({
            @ApiResponse(code = 204, message = "Restaurante desativado com sucesso"),
            @ApiResponse(code = 404, message = "Restaurante nao encontrado", response = Problem.class)
    })
    void inativar(@ApiParam(value = "ID de um restaurante",  example = "1", required = true) Long restauranteId);

    @ApiOperation("Ativa multiplos restaurantes")
    @ApiResponses({
            @ApiResponse(code = 204, message = "Restaurantes ativados com sucesso"),
    })
    void ativarMultiplos(@ApiParam(name = "corpo", value = "IDs de restaurantes", required = true) List<Long> restauranteIds);

    @ApiOperation("Inativa multiplos restaurantes")
    @ApiResponses({
            @ApiResponse(code = 204, message = "Restaurantes inativados com sucesso"),
    })
    void inativarMultiplos(@ApiParam(name = "corpo", value = "IDs de restaurantes", required = true) List<Long> restauranteIds);

    @ApiOperation("Abre um restaurante por ID")
    @ApiResponses({
            @ApiResponse(code = 204, message = "Restaurante aberto com sucesso"),
            @ApiResponse(code = 404, message = "Restaurante nao encontrado", response = Problem.class)
    })
    void abrir(@ApiParam(value = "ID de um restaurante",  example = "1", required = true) Long restauranteId);

    @ApiOperation("Fecha um restaurante por ID")
    @ApiResponses({
            @ApiResponse(code = 204, message = "Restaurante fechado com sucesso"),
            @ApiResponse(code = 404, message = "Restaurante nao encontrado", response = Problem.class)
    })
    void fechar(@ApiParam(value = "ID de um restaurante",  example = "1", required = true) Long restauranteId);
}
