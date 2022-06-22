package com.example.tdd_jdbctemplate.application.port.interactor;

import com.example.tdd_jdbctemplate.domain.Sesion;

public interface ISesionService {
    Long convertirIntToLong(int i);

    Sesion guardarSesion(Sesion sesion);
}
