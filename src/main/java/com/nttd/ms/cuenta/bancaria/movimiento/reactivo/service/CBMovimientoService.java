package com.nttd.ms.cuenta.bancaria.movimiento.reactivo.service;

import com.nttd.ms.cuenta.bancaria.movimiento.reactivo.entity.CBMovimiento;
import io.smallrye.mutiny.Uni;
import java.util.List;

public interface CBMovimientoService {

    Uni<List<CBMovimiento>> findByNumeroCuenta(String numeroCuenta);

}
