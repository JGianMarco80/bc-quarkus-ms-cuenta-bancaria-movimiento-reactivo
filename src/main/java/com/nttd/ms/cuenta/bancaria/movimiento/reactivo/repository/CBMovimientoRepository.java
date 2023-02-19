package com.nttd.ms.cuenta.bancaria.movimiento.reactivo.repository;

import com.nttd.ms.cuenta.bancaria.movimiento.reactivo.entity.CBMovimiento;
import io.quarkus.mongodb.panache.reactive.ReactivePanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CBMovimientoRepository implements ReactivePanacheMongoRepository<CBMovimiento> {
}
