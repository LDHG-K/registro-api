package com.registerapi.Registro.domain.useCase.service;

import com.registerapi.Registro.domain.model.Comprador;
import com.registerapi.Registro.domain.useCase.Repository.CompradorRepository;
import com.registerapi.Registro.domain.useCase.gateways.ICompradorCrudService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.time.LocalDate;

@Service
@AllArgsConstructor
public class CompradorCrudService implements ICompradorCrudService {

    private final CompradorRepository cr;

    @Override
    public Mono<Comprador> crearComprador(Mono<Comprador> comprador) {

        comprador.map(c -> {
            c.setNombres(c.getNombres().toUpperCase());
            c.setApellidos(c.getApellidos().toUpperCase());
            c.setFechaRegistro(LocalDate.now().toString());
            return c;
        });

        return cr.existePorClave(comprador.block().getDocumento())
                .flatMap(e -> {
                            if (e) {
                                return Mono.error(new Exception("El comprador ya existe"));
                            } else {
                                return cr.guardar(comprador);
                            }
                        }
                );
        /*
                comprador.flatMap(((c) ->
        {
            if (c.getNombres().isEmpty() || c.getApellidos().isEmpty() || c.getMail().isEmpty()) {
                System.out.println("No se puede crear el comprador 1");
                return Mono.error(new Exception("No se puede crear un comprador con campos vacios"));
            }
            if (LocalDate.parse(c.getFechaNacimiento()).isAfter(LocalDate.now())) {
                System.out.println("No se puede crear el comprador 2");
                return Mono.error(new Exception("No se puede crear un comprador con fecha de nacimiento mayor a la actual"));
            }
            else {
                cr.existePorClave(c.getDocumento()).subscribe(e-> System.out.println(e));
                System.out.println("Se creo el comprador..");

                return cr.guardar(Mono.just(c));
            }

        })
        );

         */
    }

    @Override
    public Mono<Comprador> obtenerComprador() {
        return null;
    }

    @Override
    public Mono<Comprador> buscarPorPalabraClave(String clave) {
        return cr.buscarPorClave(clave);
    }


    @Override
    public Mono<Comprador> editarComprador(Mono<Comprador> comprador) {
        return null;
    }
}
