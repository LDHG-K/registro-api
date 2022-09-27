package com.registerapi.Registro.domain.useCase.gateways;

import com.registerapi.Registro.domain.model.DetalleFactura;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IDetallefacturaCrudService {

    Flux<DetalleFactura> guardarDetalle();
    Flux<DetalleFactura> consultarDetallesfactura(Long idFactura);
    Mono<DetalleFactura> editarDetalle(Mono<DetalleFactura> detalle);
    Mono<DetalleFactura> eliminarDetalle(Mono<DetalleFactura> detalle);

}
