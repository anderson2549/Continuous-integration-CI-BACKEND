package com.example.app_persona;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ApplicationTest {

    @Autowired
    private PersonaController personaController;

    @Test
    public void contextLoads() {
        assertNotNull(personaController);
    }
}
