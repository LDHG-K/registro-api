package com.registerapi.Registro.infraestructure.driverAdapter.ReactiveRepository.repository;

import com.registerapi.Registro.domain.model.Producto;
import com.registerapi.Registro.infraestructure.driverAdapter.ReactiveRepository.collections.ProductoCollection;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductoMongoRepository extends ReactiveMongoRepository<ProductoCollection,Long> {
}
