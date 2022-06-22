package com.example.tdd_jdbctemplate.infrastructure.repository.db;

import com.example.tdd_jdbctemplate.application.port.output.ISesionDb;
import com.example.tdd_jdbctemplate.domain.Sesion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;

@Repository
public class SesionDb implements ISesionDb {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Sesion crearSesion(Sesion sesion) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        String query = "INSERT INTO sesion (token) VALUES (?)";
        int resultado = jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(query,new String[]{"id"});
            ps.setObject(1,sesion.getToken());
            return ps;
        }, keyHolder);
        sesion.setId((Long)keyHolder.getKey());
        return resultado == 1 ? sesion : new Sesion();
    }
}
