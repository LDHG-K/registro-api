package com.registerapi.Registro.domain.useCase;

import com.registerapi.Registro.domain.model.DetalleFactura;
import com.registerapi.Registro.domain.useCase.gateways.IDetallefacturaCrudService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class DetalleFacturaCrudService implements IDetallefacturaCrudService {
    @Override
    public Flux<DetalleFactura> guardarDetalle() {
        return null;
    }

    @Override
    public Flux<DetalleFactura> consultarDetallesfactura(Long idFactura) {
        return null;
    }

    @Override
    public Mono<DetalleFactura> editarDetalle(Mono<DetalleFactura> detalle) {
        return null;
    }

    @Override
    public Mono<DetalleFactura> eliminarDetalle(Mono<DetalleFactura> detalle) {
        return null;
    }
}
