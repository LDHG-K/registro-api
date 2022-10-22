package com.registerapi.Registro.infraestructure.driverAdapter.ReactiveRepository.collections;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

import java.math.BigDecimal;

@Data
@Builder
public class ProductoCollection {

    @Id
    private Long id;
    @Indexed(unique = true)
    private String serial;
    private String categoria;
    private String nombre;
    private Integer unidades;
    private BigDecimal precioActual;
    private Integer descripcion;
    private String fabricante;

}
