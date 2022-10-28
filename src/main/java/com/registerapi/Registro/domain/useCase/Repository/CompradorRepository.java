package com.registerapi.Registro.domain.useCase.Repository;

import com.registerapi.Registro.domain.model.Comprador;
import com.registerapi.Registro.infraestructure.driverAdapter.ReactiveRepository.collections.CompradorCollection;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CompradorRepository {

    Mono<Comprador> guardar(Mono<Comprador> compradorMono);
    Mono<Comprador> editar(Mono<CompradorCollection> compradorMono);
    Mono<Comprador> buscarPorClave(String id);
    Mono<Void> eliminar(String id);

    Mono<Boolean> existePorClave(String id);

}
