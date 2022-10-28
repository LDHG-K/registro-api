package com.registerapi.Registro.infraestructure.driverAdapter.ReactiveRepository.collections;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Calendar;

@Data
@Builder
@Document(collection = "comprador")
public class CompradorCollection {

    @Id
    private String documento;
    private String tipoDocumento;

    private String nombres;
    private String apellidos;

    @Indexed(unique = true)
    private String mail;
    private String fechaRegistro;
    private String fechaNacimiento;

}
