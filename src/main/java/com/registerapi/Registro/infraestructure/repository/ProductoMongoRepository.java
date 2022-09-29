package com.registerapi.Registro.infraestructure.repository;

import com.registerapi.Registro.domain.model.Producto;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductoMongoRepository extends ReactiveMongoRepository<Producto,Long> {
}
