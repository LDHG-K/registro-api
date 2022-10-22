package com.registerapi.Registro.infraestructure.driverAdapter.ReactiveRepository.collections;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@Builder
@Document(collection = "detalleFactura")
public class DetalleFacturaCollection {

    @Id
    private String serialProducto;
    private Long idFactura;
    private Integer unidades;
    private Double descuento;
    private Double impuesto;
    private BigDecimal total;
}
