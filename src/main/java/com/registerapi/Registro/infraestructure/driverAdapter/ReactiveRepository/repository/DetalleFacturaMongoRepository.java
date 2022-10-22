package com.registerapi.Registro.infraestructure.driverAdapter.ReactiveRepository.repository;

import com.registerapi.Registro.domain.model.DetalleFactura;
import com.registerapi.Registro.infraestructure.driverAdapter.ReactiveRepository.collections.DetalleFacturaCollection;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface DetalleFacturaMongoRepository extends ReactiveMongoRepository<DetalleFacturaCollection,String> {
}
