package com.registerapi.Registro.domain.model;

import lombok.Builder;
import lombok.Data;
import java.util.Calendar;

@Data
@Builder
public class Comprador {

    private Long id;
    private String documento;
    private String tipoDocumento;
    private String nombres;
    private String apellidos;
    private String mail;
    private Calendar fechaRegistro;
    private Calendar fechaNacimiento;

}
