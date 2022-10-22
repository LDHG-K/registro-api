package com.registerapi.Registro.infraestructure.driverAdapter.ReactiveRepository.mapper;

import com.registerapi.Registro.domain.model.Producto;
import com.registerapi.Registro.infraestructure.driverAdapter.ReactiveRepository.collections.ProductoCollection;
import org.springframework.stereotype.Service;

@Service
public class ProductoMapper {

    public ProductoCollection prodToProdCollToProd(Producto producto) {
        return ProductoCollection.builder()
                .id(producto.getId())
                .categoria(producto.getCategoria())
                .descripcion(producto.getDescripcion())
                .fabricante(producto.getFabricante())
                .nombre(producto.getNombre())
                .precioActual(producto.getPrecioActual())
                .serial(producto.getSerial())
                .unidades(producto.getUnidades())
                .build();

    }

    Producto proCollToProducto(ProductoCollection productoCollection){
        return null;
    }



}
