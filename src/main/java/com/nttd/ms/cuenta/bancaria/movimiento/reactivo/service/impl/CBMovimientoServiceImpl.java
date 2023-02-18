package com.nttd.ms.cuenta.bancaria.movimiento.reactivo.service.impl;

import com.nttd.ms.cuenta.bancaria.movimiento.reactivo.entity.CBMovimiento;
import com.nttd.ms.cuenta.bancaria.movimiento.reactivo.repository.CBMovimientoRepository;
import com.nttd.ms.cuenta.bancaria.movimiento.reactivo.service.CBMovimientoService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class CBMovimientoServiceImpl implements CBMovimientoService {

    @Inject
    CBMovimientoRepository repository;

    @Override
    public List<CBMovimiento> findByNumeroCuenta(String numeroCuenta) {
        List<CBMovimiento> cbMovimientos = repository.listAll();

        List<CBMovimiento> cbmObtenidos = new ArrayList<>();

        for (CBMovimiento cbm: cbMovimientos) {
                if (cbm.getNumeroCuenta().equals(numeroCuenta)) {
                    cbmObtenidos.add(cbm);
                }
        }

        return cbmObtenidos;
    }
}
