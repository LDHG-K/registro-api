package com.registerapi.Registro.domain.useCase.gateways;

import com.registerapi.Registro.domain.model.Factura;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Calendar;

public interface IFacturaCrudService {

    Mono<Factura> registrarFactura();
    Mono<Factura> buscarFactura(Long id);
    Flux<Factura> buscarTodasFacturas();
    Flux<Factura> buscarTodasFacturasFecha(Calendar fecha);
    Flux<Factura> buscarTodasFacturasCliente(String cliente);
    Flux<Factura> buscarTodasFacturasCerradas();
    Flux<Factura> buscarTodasFacturasAbiertas();
    Mono<Factura> editarFactura(Mono<Factura> facturaMono);

}
