package com.nttd.ms.cuenta.bancaria.movimiento.reactivo.service.impl;

import com.nttd.ms.cuenta.bancaria.movimiento.reactivo.entity.CBMovimiento;
import com.nttd.ms.cuenta.bancaria.movimiento.reactivo.repository.CBMovimientoRepository;
import com.nttd.ms.cuenta.bancaria.movimiento.reactivo.service.CBMovimientoService;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.util.List;

@ApplicationScoped
public class CBMovimientoServiceImpl implements CBMovimientoService {

    @Inject
    CBMovimientoRepository repository;

    @Override
    public Uni<List<CBMovimiento>> findByNumeroCuenta(String numeroCuenta) {
        return repository.listAll()
                .onItem()
                .<CBMovimiento>disjoint().map(cbMovimiento -> {
                    CBMovimiento cbm = new CBMovimiento();
                    if(cbMovimiento.getNumeroCuenta().equals(numeroCuenta)) {
                        cbm = cbMovimiento;
                    }
                    return cbm;
                }).collect().asList();
    }
}
