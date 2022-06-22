package com.example.tdd_jdbctemplate.application.service;

import com.example.tdd_jdbctemplate.application.port.interactor.ISesionService;
import com.example.tdd_jdbctemplate.domain.Sesion;
import org.springframework.stereotype.Service;

@Service
public class SesionService implements ISesionService {
    @Override
    public Long convertirIntToLong(int valorInteger) {
        return new Long(valorInteger);
    }

    @Override
    public Sesion guardarSesion(Sesion sesion) {
        return new Sesion();
    }
}
