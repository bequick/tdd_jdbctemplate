package com.example.tdd_jdbctemplate.application.service;

import com.example.tdd_jdbctemplate.configuration.Data;
import com.example.tdd_jdbctemplate.domain.Sesion;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest(classes = SesionService.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class SesionServiceTest {

    SesionService sesionService;

    @Before
    public void setUp() throws Exception {
        sesionService = new SesionService();
    }

    @Test
    public void convertirIntToLongTest() {
        int id_sesion = 1;
        Long numberResult = sesionService.convertirIntToLong(id_sesion);
        Assertions.assertEquals(1L, numberResult);
    }

    @Test
    public void crearSesion() {
        Sesion sesion = Data.SESION();
        Assertions.assertEquals(1L, sesion.id);
        Assertions.assertEquals("xzy", sesion.token);
    }

    @Test
    public void guardarSesion() {
       Sesion sesion = sesionService.guardarSesion(Data.SESION());
       Assertions.assertNotNull(sesion);
    }
}
