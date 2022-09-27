package com.registerapi.Registro.domain.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class DetalleFactura {

    private String serialProducto;
    private Long idFactura;
    private Integer unidades;
    private Double descuento;
    private Double impuesto;
    private BigDecimal total;

}
