package com.registerapi.Registro.domain.useCase.Repository;

import com.registerapi.Registro.domain.model.Comprador;
import com.registerapi.Registro.infraestructure.driverAdapter.ReactiveRepository.collections.CompradorCollection;
import reactor.core.publisher.Mono;

public interface CompradorRepository {

    Mono<Comprador> guardar(Mono<Comprador> compradorMono);
    Mono<Comprador> editar(Mono<CompradorCollection> compradorMono);
    Mono<Comprador> buscarPorClave(Long id);
    Mono<Void> eliminar(Long id);

}
