package com.registerapi.Registro.domain.useCase.Repository;

import com.registerapi.Registro.domain.model.Comprador;
import reactor.core.publisher.Mono;

public interface CompradorRepository {

    Mono<Comprador> guardar(Mono<Comprador> compradorMono);
    Mono<Comprador> editar(Mono<Comprador> compradorMono);
    Mono<Comprador> buscarPorClave(String id);
    Mono<Comprador> eliminar(Long id);

}
