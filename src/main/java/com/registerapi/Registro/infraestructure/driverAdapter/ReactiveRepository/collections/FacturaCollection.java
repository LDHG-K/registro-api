package com.registerapi.Registro.infraestructure.driverAdapter.ReactiveRepository.collections;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.util.Calendar;

@Data
@Builder
public class FacturaCollection {

    @Id
    private Long id;
    private Calendar diaVenta;
    private Calendar diaEnvio;
    private BigDecimal total;
    private BigDecimal envio;
    private Integer codCiudad;
    private String formaPago;
    private String guiaEnvio;
    private String empresaEnvio;
    private String comprador;
    private String estado;
}
