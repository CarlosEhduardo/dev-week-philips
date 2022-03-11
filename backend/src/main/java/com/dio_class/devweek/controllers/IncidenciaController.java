package com.dio_class.devweek.controllers;

import com.dio_class.devweek.entities.Incidencia;
import com.dio_class.devweek.repositories.IncidenciaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class IncidenciaController {
    private final IncidenciaRepository repository;

    public IncidenciaController(IncidenciaRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/incidencias")
    public List<Incidencia> getIncidencias() {
        return repository.findAll();
    }

    @GetMapping("/incidencia/{id}")
    public ResponseEntity getIncidenciaById(@PathVariable Long id) {
        Optional incidenciaOptional = repository.findById(id);
        if (incidenciaOptional.isPresent()) {
            return new ResponseEntity(incidenciaOptional.get(), HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/incidencia/nova_incidencia")
    public void postIncidencia(@RequestBody Incidencia incidencia) {
        repository.save(incidencia);
    }

    @PostMapping("/incidencia/delete/{id}")
    public void deleteIncidencia(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
