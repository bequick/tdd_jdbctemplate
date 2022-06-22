package com.example.tdd_jdbctemplate.configuration;


import com.example.tdd_jdbctemplate.domain.Sesion;

public class Data {
    public static Sesion SESION() {
        Sesion sesion = new Sesion();
        sesion.id = 1L;
        sesion.token = "xzy";
        return sesion;
    }
}
