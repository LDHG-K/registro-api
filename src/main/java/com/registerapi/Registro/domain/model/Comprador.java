package com.registerapi.Registro.domain.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Calendar;

@Data
@Builder
public class Comprador{

    private String documento;
    private String tipoDocumento;
    private String nombres;
    private String apellidos;
    private String mail;
    private String fechaRegistro;
    private String fechaNacimiento;

}
