package com.registerapi.Registro.infraestructure.driverAdapter.ReactiveRepository.Imp;

import com.registerapi.Registro.domain.model.Comprador;
import com.registerapi.Registro.domain.useCase.Repository.CompradorRepository;
import com.registerapi.Registro.domain.useCase.gateways.ICompradorCrudService;
import com.registerapi.Registro.infraestructure.driverAdapter.ReactiveRepository.repository.CompradorMongoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class CompradorRepositoryImp implements CompradorRepository {

    private final CompradorMongoRepository cs;

    @Override
    public Mono<Comprador> guardar(Mono<Comprador> compradorMono) {
        return null;
    }

    @Override
    public Mono<Comprador> editar(Mono<Comprador> compradorMono) {
        return null;
    }

    @Override
    public Mono<Comprador> buscarPorClave(String id) {
        return null;
    }

    @Override
    public Mono<Comprador> eliminar(Long id) {
        return null;
    }
}
