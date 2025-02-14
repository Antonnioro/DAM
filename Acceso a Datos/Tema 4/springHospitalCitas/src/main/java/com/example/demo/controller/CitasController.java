package com.example.demo.controller;

import com.example.demo.entity.Citas;
import com.example.demo.repository.CitasRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/citas")
public class CitasController {

    private final CitasRepository citasRepository;

    public CitasController(CitasRepository citasRepository) {
        this.citasRepository = citasRepository;
    }

    @GetMapping
    public List<Citas> getAllCitas() {
        return citasRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Citas> getCitaById(@PathVariable Integer id) {
        Optional<Citas> cita = citasRepository.findById(id);
        return cita.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}

