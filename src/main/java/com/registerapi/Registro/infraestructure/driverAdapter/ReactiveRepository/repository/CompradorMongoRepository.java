package com.registerapi.Registro.infraestructure.driverAdapter.ReactiveRepository.repository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import com.registerapi.Registro.domain.model.Comprador;

public interface CompradorMongoRepository extends ReactiveMongoRepository<Comprador,Long>{
}
