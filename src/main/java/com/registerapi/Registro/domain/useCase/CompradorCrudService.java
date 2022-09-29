package com.registerapi.Registro.domain.useCase;

import com.registerapi.Registro.domain.model.Comprador;
import com.registerapi.Registro.domain.useCase.gateways.ICompradorCrudService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class CompradorCrudService implements ICompradorCrudService {
    @Override
    public Mono<Comprador> crearComprador(Mono<Comprador> comprador) {
        return null;
    }

    @Override
    public Mono<Comprador> obtenerComprador() {
        return null;
    }

    @Override
    public Flux<Comprador> listarPorPalabraClave(String clave) {
        return null;
    }

    @Override
    public Mono<Comprador> editarComprador(Mono<Comprador> comprador) {
        return null;
    }
}
