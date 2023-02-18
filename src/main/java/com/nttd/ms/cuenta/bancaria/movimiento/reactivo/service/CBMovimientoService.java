package com.nttd.ms.cuenta.bancaria.movimiento.reactivo.service;

import com.nttd.ms.cuenta.bancaria.movimiento.reactivo.entity.CBMovimiento;
import jakarta.ws.rs.QueryParam;

import java.util.List;

public interface CBMovimientoService {

    List<CBMovimiento> findByNumeroCuenta(String numeroCuenta);

}
