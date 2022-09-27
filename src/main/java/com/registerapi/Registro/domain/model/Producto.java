package com.registerapi.Registro.domain.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Producto {

    private Long id;
    private String serial;
    private String categoria;
    private String nombre;
    private Integer unidades;
    private BigDecimal precioActual;
    private Integer descripcion;
    private String fabricante;

}
