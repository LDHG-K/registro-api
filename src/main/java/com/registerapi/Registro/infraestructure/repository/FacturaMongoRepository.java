package com.registerapi.Registro.infraestructure.repository;

import com.registerapi.Registro.domain.model.Factura;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface FacturaMongoRepository extends ReactiveMongoRepository<Factura,Long> {
}
