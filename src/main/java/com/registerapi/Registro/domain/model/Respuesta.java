package com.registerapi.Registro.domain.model;

import lombok.Builder;
import lombok.Data;
import reactor.core.publisher.Mono;

import java.util.Map;

@Builder
@Data
public class Respuesta {

    private String mensaje;
    private String codigo;
    private String fecha;
    private Object data;
    private String estado;


}
