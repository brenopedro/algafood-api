package com.algaworks.algafood.api.openapi.controller;

import com.algaworks.algafood.domain.filter.VendaDiariaFilter;
import com.algaworks.algafood.domain.model.dto.VendaDiaria;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Api(tags = "Estatísticas")
public interface EstatisticasControllerOpenApi {


    @ApiOperation(value = "Consulta as estatísticas")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "ID do restaurante", name = "restauranteId", example = "1", dataType = "int"),
            @ApiImplicitParam(value = "Data/hora inicial da criação do pedido", name = "dataCriacaoInicio",
                    example = "2019-12-01T00:00:00Z", dataType = "date-time"),
            @ApiImplicitParam(value = "Data/hora final da criação do pedido", name = "dataCriacaoFim",
                    example = "2019-12-01T00:00:00Z", dataType = "date-time")
    })
    List<VendaDiaria> consultarVendasDiarias(
            VendaDiariaFilter filtro,
            @ApiParam(value = "Deslocamento de horário a ser considerado na consulta em relação ao UTC",
                    defaultValue = "+00:00") String timeOffset);

    ResponseEntity<byte[]> consultarVendasDiariasPdf(VendaDiariaFilter filtro,
                                                             String timeOffset);
}
