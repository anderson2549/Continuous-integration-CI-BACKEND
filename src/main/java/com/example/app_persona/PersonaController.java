package com.example.app_persona;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
@RequestMapping("/personas")
public class PersonaController {
    private final PersonaRepository repo;
    public PersonaController(PersonaRepository r){ this.repo=r; }
    @GetMapping
    public List<Persona> all(){ return repo.findAll(); }
}
