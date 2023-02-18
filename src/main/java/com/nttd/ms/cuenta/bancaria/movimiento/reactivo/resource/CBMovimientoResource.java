package com.nttd.ms.cuenta.bancaria.movimiento.reactivo.resource;

import com.nttd.ms.cuenta.bancaria.movimiento.reactivo.entity.CBMovimiento;
import com.nttd.ms.cuenta.bancaria.movimiento.reactivo.service.CBMovimientoService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/cuenta-bancaria-movimiento")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CBMovimientoResource {

    @Inject
    CBMovimientoService cbMovimientoService;

    @GET
    public List<CBMovimiento> findByNumeroCuenta(@QueryParam("numeroCuenta") String numeroCuenta) {
        return cbMovimientoService.findByNumeroCuenta(numeroCuenta);
    }
}
