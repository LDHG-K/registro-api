package com.registerapi.Registro.infraestructure.driverAdapter.ReactiveRepository.Imp;

import com.registerapi.Registro.domain.model.Comprador;
import com.registerapi.Registro.domain.useCase.Repository.CompradorRepository;
import com.registerapi.Registro.infraestructure.driverAdapter.ReactiveRepository.collections.CompradorCollection;
import com.registerapi.Registro.infraestructure.driverAdapter.ReactiveRepository.mapper.CompradorMapper;
import com.registerapi.Registro.infraestructure.driverAdapter.ReactiveRepository.repository.CompradorMongoRepositoryE;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class CompradorRepositoryImp implements CompradorRepository {

    private final CompradorMongoRepositoryE cs;
    private final CompradorMapper cm;

    @Override
    public Mono<Comprador> guardar(Mono<Comprador> compradorMono) {
        return compradorMono.map(c -> cm.compradorToCompradorC(c))
                .flatMap(cs::save)
                .map(e -> cm.compradorCToComprador(e));
    }

    @Override
    public Mono<Comprador> editar(Mono<CompradorCollection> compradorMono) {
      return compradorMono.flatMap(cs::save).map(e->cm.compradorCToComprador(e));
    }

    @Override
    public Mono<Comprador> buscarPorClave(String id) {
        return cs.findById(id).map(e->cm.compradorCToComprador(e));
    }

    @Override
    public Mono<Void> eliminar(String id) {
        return cs.deleteById(id);    }

    @Override
    public Mono<Boolean> existePorClave(String id) {
        return cs.existsById(id);
    }
}
