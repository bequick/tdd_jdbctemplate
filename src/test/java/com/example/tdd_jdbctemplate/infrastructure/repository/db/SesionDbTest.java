package com.example.tdd_jdbctemplate.infrastructure.repository.db;

import com.example.tdd_jdbctemplate.configuration.Data;
import com.example.tdd_jdbctemplate.domain.Sesion;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest(classes = SesionDb.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class SesionDbTest {

    @Autowired
    SesionDb sesionDb;

    @MockBean
    private JdbcTemplate jdbcTemplate;

    @Before
    public void setUp() throws Exception {
        sesionDb = new SesionDb();
    }

    @Test
    public void crearSesion() {
        Sesion sesion = sesionDb.crearSesion(Data.SESION());
        Assertions.assertNotNull(sesion);
    }




}
