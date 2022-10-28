package com.registerapi.Registro.domain.useCase.service;

import com.registerapi.Registro.domain.model.Producto;
import com.registerapi.Registro.domain.useCase.gateways.IProductoCrudService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ProductoCrudService implements IProductoCrudService {
    @Override
    public Mono<Producto> crearProducto(Mono<Producto> producto) {
        return null;
    }

    @Override
    public Mono<Producto> obtenerProducto() {
        return null;
    }

    @Override
    public Flux<Producto> obtenerTodosLosProductos() {
        return null;
    }

    @Override
    public Flux<Producto> obtenerTodosLosProductosActivos() {
        return null;
    }

    @Override
    public Flux<Producto> obtenerTodosLosProductosCategoria() {
        return null;
    }

    @Override
    public Mono<Producto> editarProducto(Mono<Producto> producto) {
        return null;
    }

    @Override
    public Mono<Producto> eliminarProducto(String id) {
        return null;
    }
}
