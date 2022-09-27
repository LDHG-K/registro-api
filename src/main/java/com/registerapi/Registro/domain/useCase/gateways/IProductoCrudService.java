package com.registerapi.Registro.domain.useCase.gateways;

import com.registerapi.Registro.domain.model.Producto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IProductoCrudService {

    Mono<Producto> crearProducto(Mono<Producto> producto);

    Mono<Producto> obtenerProducto();

    Flux<Producto> obtenerTodosLosProductos();

    Flux<Producto> obtenerTodosLosProductosActivos();

    Flux<Producto> obtenerTodosLosProductosCategoria();

    Mono<Producto> editarProducto(Mono<Producto> producto);

    Mono<Producto> eliminarProducto(String id);

}
