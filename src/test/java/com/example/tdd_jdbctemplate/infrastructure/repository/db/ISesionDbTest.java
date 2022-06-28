package com.example.tdd_jdbctemplate.infrastructure.repository.db;

import com.example.tdd_jdbctemplate.Application;
import com.example.tdd_jdbctemplate.configuration.Data;
import com.example.tdd_jdbctemplate.domain.Sesion;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
public class ISesionDbTest {

    @Autowired
    DataSource dataSource;


    @Autowired
    private SesionDb sesionDb;


    @Test
    public void DataSourceTest() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        Assertions.assertNotNull(jdbcTemplate);
    }

    @Test
    public void crearSesion() {
        Sesion sesion = sesionDb.crearSesion(Data.SESION());

        Assertions.assertNotNull(sesion);
    }

}
