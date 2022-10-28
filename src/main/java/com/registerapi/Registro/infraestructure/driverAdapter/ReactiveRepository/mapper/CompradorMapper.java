package com.registerapi.Registro.infraestructure.driverAdapter.ReactiveRepository.mapper;

import com.registerapi.Registro.domain.model.Comprador;
import com.registerapi.Registro.domain.useCase.Repository.CompradorRepository;
import com.registerapi.Registro.infraestructure.driverAdapter.ReactiveRepository.collections.CompradorCollection;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class CompradorMapper {

    public Comprador compradorCToComprador(CompradorCollection cc){
        return Comprador.builder()
                .documento(cc.getDocumento())
                .apellidos(cc.getApellidos())
                .fechaNacimiento(cc.getFechaNacimiento())
                .fechaRegistro(cc.getFechaRegistro())
                .mail(cc.getMail())
                .nombres(cc.getNombres())
                .tipoDocumento(cc.getTipoDocumento())
                .build();


    }

    public CompradorCollection compradorToCompradorC(Comprador c){
        return CompradorCollection.builder()

                .apellidos(c.getApellidos())
                .documento(c.getDocumento())
                .fechaNacimiento(c.getFechaNacimiento())
                .fechaRegistro(c.getFechaRegistro())
                .mail(c.getMail())
                .nombres(c.getNombres())
                .tipoDocumento(c.getTipoDocumento())
                .build();
    }





}
