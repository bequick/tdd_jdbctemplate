package com.example.tdd_jdbctemplate.application.port.output;

import com.example.tdd_jdbctemplate.domain.Sesion;

public interface ISesionDb {
    Sesion crearSesion(Sesion sesion);
}
