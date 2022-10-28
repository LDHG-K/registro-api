package com.registerapi.Registro.domain.useCase.service;

import com.registerapi.Registro.domain.model.Factura;
import com.registerapi.Registro.domain.useCase.gateways.IFacturaCrudService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Calendar;

public class FacturaCrudService implements IFacturaCrudService {
    @Override
    public Mono<Factura> registrarFactura() {
        return null;
    }

    @Override
    public Mono<Factura> buscarFactura(Long id) {
        return null;
    }

    @Override
    public Flux<Factura> buscarTodasFacturas() {
        return null;
    }

    @Override
    public Flux<Factura> buscarTodasFacturasFecha(Calendar fecha) {
        return null;
    }

    @Override
    public Flux<Factura> buscarTodasFacturasCliente(String cliente) {
        return null;
    }

    @Override
    public Flux<Factura> buscarTodasFacturasCerradas() {
        return null;
    }

    @Override
    public Flux<Factura> buscarTodasFacturasAbiertas() {
        return null;
    }

    @Override
    public Mono<Factura> editarFactura(Mono<Factura> facturaMono) {
        return null;
    }
}
