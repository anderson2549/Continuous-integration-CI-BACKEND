package com.example.app_persona;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {

    @Test
    public void testPersonaGettersAndSetters() {
        Persona persona = new Persona();
        
        persona.setNombre("Juan Pérez");
        persona.setDocumento("12345678");
        persona.setTelefono("+57 300 123 4567");
        
        assertEquals("Juan Pérez", persona.getNombre());
        assertEquals("12345678", persona.getDocumento());
        assertEquals("+57 300 123 4567", persona.getTelefono());
    }

    @Test
    public void testPersonaNombreIsNotNull() {
        Persona persona = new Persona();
        persona.setNombre("María García");
        
        assertNotNull(persona.getNombre());
    }

    @Test
    public void testPersonaDocumentoIsNotNull() {
        Persona persona = new Persona();
        persona.setDocumento("87654321");
        
        assertNotNull(persona.getDocumento());
    }
}
