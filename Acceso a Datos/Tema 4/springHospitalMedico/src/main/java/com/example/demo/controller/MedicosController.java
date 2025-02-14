package com.example.demo.controller;

import com.example.demo.entity.Medicos;
import com.example.demo.repository.MedicosRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/medicos")
public class MedicosController {

    private final MedicosRepository medicosRepository;

    public MedicosController(MedicosRepository medicosRepository) {
        this.medicosRepository = medicosRepository;
    }

    // Obtener todos los pacientes
    @GetMapping
    public List<Medicos> getAllMedicos() {
        return medicosRepository.findAll();
    }

    // Obtener un paciente por ID
    @GetMapping("/{id}")
    public ResponseEntity<Medicos> getMedicoById(@PathVariable Integer id) {
        Optional<Medicos> medico = medicosRepository.findById(id);
        return medico.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}

