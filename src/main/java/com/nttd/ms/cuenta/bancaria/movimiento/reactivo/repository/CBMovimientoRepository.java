package com.nttd.ms.cuenta.bancaria.movimiento.reactivo.repository;

import com.nttd.ms.cuenta.bancaria.movimiento.reactivo.entity.CBMovimiento;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CBMovimientoRepository implements PanacheMongoRepository<CBMovimiento> {
}
