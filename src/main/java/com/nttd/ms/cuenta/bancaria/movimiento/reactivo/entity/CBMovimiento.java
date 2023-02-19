package com.nttd.ms.cuenta.bancaria.movimiento.reactivo.entity;

import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import java.time.LocalDate;

@MongoEntity(collection = "cuenta_bancaria_movimiento")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CBMovimiento {

    private ObjectId id;

    private String numeroCuenta;

    //1: deposito
    //2: retiro
    private String tipoMovimiento;

    private String descripcion;

    private Double monto;

    private LocalDate fecha;

}
