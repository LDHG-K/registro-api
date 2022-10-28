package com.registerapi.Registro.domain.useCase.gateways;

import com.registerapi.Registro.domain.model.Comprador;
import com.registerapi.Registro.domain.model.Producto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ICompradorCrudService {

    Mono<Comprador> crearComprador(Mono<Comprador> comprador);

    Mono<Comprador> obtenerComprador();

    Mono<Comprador> buscarPorPalabraClave(String clave);

    Mono<Comprador> editarComprador(Mono<Comprador> comprador);

}
