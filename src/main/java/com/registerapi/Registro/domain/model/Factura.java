package com.registerapi.Registro.domain.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Calendar;

@Data
@Builder
public class Factura {

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
