package com.algaworks.algafood.api.openapi.controller;

import com.algaworks.algafood.api.exceptionhandler.Problem;
import com.algaworks.algafood.api.model.FormaPagamentoModel;
import io.swagger.annotations.*;

import java.util.List;

@Api(tags = "Restaurantes")
public interface RestauranteFormaPagamentoControllerOpenApi {

    @ApiOperation("Lista as formas de pagamentos do restaurante")
    @ApiResponses({
            @ApiResponse(code = 404, message = "Restaurante não encontrado", response = Problem.class)
    })
    List<FormaPagamentoModel> listar(@ApiParam(value = "ID do restaurante", example = "1",required = true)
                                             Long restauranteId);

    @ApiOperation("Desassociação de restaurante com forma de pagamento")
    @ApiResponses({
            @ApiResponse(code = 204, message = "Desassociação realizada com sucesso"),
            @ApiResponse(code = 404, message = "Restaurante não encontrado", response = Problem.class)
    })
    void desassociar(@ApiParam(value = "ID do restaurante", example = "1",required = true)
                             Long restauranteId,
                     @ApiParam(value = "ID da forma de pagamnto", example = "1",required = true)
                             Long formaPagamentoId);

    @ApiOperation("Desassociação de restaurante com forma de pagamento")
    @ApiResponses({
            @ApiResponse(code = 204, message = "Associação realizada com sucesso"),
            @ApiResponse(code = 404, message = "Restaurante não encontrado", response = Problem.class)
    })
    void associar(@ApiParam(value = "ID do restaurante", example = "1",required = true)
                          Long restauranteId,
                  @ApiParam(value = "ID da forma de pagamnto", example = "1",required = true)
                          Long formaPagamentoId);
}
