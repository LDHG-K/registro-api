package com.registerapi.Registro.infraestructure.entryPoints;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    //Service

    @PostMapping("crear")
    public Mono crearProducto(){
        return null;
    }

    @GetMapping("buscar/{i}")
    public Mono obtenerProducto(){
        return null;
    }

    @GetMapping("buscartodos")
    public Flux obtenerProductos(){
        return null;
    }

    @GetMapping("buscartodos/activos")
    public Flux obtenerProductosActivos(){
        return null;
    }

    @GetMapping("buscartodos/categoria")
    public Flux obtenerProductosCategoria(){
        return null;
    }

    @PutMapping("editar")
    public Mono editarProducto(){
        return null;
    }

    @PutMapping("eliminar/{id}")
    public Mono eliminarProducto(){
        return null;
    }

}
