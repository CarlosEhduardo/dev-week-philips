package com.dio_class.devweek.controllers;

import com.dio_class.devweek.entities.Regiao;
import com.dio_class.devweek.repositories.RegiaoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RegiaoController {
    private final RegiaoRepository repository;

    public RegiaoController(RegiaoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/regioes")
    public List<Regiao> getRegioes() {
        return repository.findAll();
    }

    @GetMapping("/regiao/{id}")
    public ResponseEntity<?> getRegiaoById(@PathVariable Long id) {
        Optional regiaoOptional = repository.findById(id);
        if (regiaoOptional.isPresent()) {
            return new ResponseEntity(regiaoOptional.get(), HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/regiao/nova_regiao")
    public void postRegiao(@RequestBody Regiao regiao) {
        repository.save(regiao);
    }

    @DeleteMapping("/regiao/delete/{id}")
    public void deleteRegiao(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
