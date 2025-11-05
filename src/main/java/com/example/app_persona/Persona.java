package com.example.app_persona;
import jakarta.persistence.*;
@Entity
public class Persona {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String documento;
    private String telefono;
    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public void setNombre(String n) { nombre = n; }
    public String getDocumento() { return documento; }
    public void setDocumento(String d) { documento = d; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String t) { telefono = t; }
}
