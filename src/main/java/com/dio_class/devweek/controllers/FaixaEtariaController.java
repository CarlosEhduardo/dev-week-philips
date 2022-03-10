package com.dio_class.devweek.controllers;

import com.dio_class.devweek.entities.FaixaEtaria;
import com.dio_class.devweek.repositories.FaixaEtariaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FaixaEtariaController {
    private final FaixaEtariaRepository repository;

    public FaixaEtariaController(FaixaEtariaRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/faixa_etaria")
    public ResponseEntity getFaixaEtarias() {
        try {
            List<FaixaEtaria> lista = repository.findAll();
            return new ResponseEntity<>(lista, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/faixa_etaria/{id}")
    public ResponseEntity getFaixaEtariaById(@PathVariable Long id) {
        Optional<FaixaEtaria> faixaEtariaOptionalOptional = repository.findById(id);
        if (faixaEtariaOptionalOptional.isPresent()) {
            return new ResponseEntity(faixaEtariaOptionalOptional.get(), HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/faixa_etaria/nova_faixa_etaria")
    public void postFixaEtaria(@RequestBody FaixaEtaria faixaEtaria) {
        repository.save(faixaEtaria);
    }

    @PostMapping("/faixa_etaria/delete/{id}")
    public void deleteFaixaEtaria(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
