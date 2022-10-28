package com.registerapi.Registro.infraestructure.driverAdapter.ReactiveRepository.repository;
import com.registerapi.Registro.infraestructure.driverAdapter.ReactiveRepository.collections.CompradorCollection;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;


public interface CompradorMongoRepositoryE extends ReactiveMongoRepository<CompradorCollection,String>{
}
