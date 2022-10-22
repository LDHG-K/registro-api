package com.registerapi.Registro.domain.useCase;

import com.registerapi.Registro.domain.model.Comprador;
import com.registerapi.Registro.domain.useCase.Repository.CompradorRepository;
import com.registerapi.Registro.domain.useCase.gateways.ICompradorCrudService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
@AllArgsConstructor
public class CompradorCrudService implements ICompradorCrudService {

    private final CompradorRepository cr;

    @Override
    public Mono<Comprador> crearComprador(Mono<Comprador> comprador) {
        System.out.println("Servicio");
        return cr.guardar(comprador);
    }

    @Override
    public Mono<Comprador> obtenerComprador() {
        return null;
    }

    @Override
    public Flux<Comprador> listarPorPalabraClave(String clave) {
        return null;
    }

    @Override
    public Mono<Comprador> editarComprador(Mono<Comprador> comprador) {
        return null;
    }
}
