package com.example.demo.controller;

import com.example.demo.entity.Pacientes;
import com.example.demo.repository.PacientesRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pacientes") // Se establece el prefijo "/pacientes"
public class PacientesController {

    private final PacientesRepository pacientesRepository;

    public PacientesController(PacientesRepository pacientesRepository) {
        this.pacientesRepository = pacientesRepository;
    }

    // Obtener todos los pacientes
    @GetMapping
    public List<Pacientes> getAllPacientes() {
        return pacientesRepository.findAll();
    }

    // Obtener un paciente por ID
    @GetMapping("/{id}")
    public ResponseEntity<Pacientes> getPacienteById(@PathVariable Integer id) {
        Optional<Pacientes> paciente = pacientesRepository.findById(id);
        return paciente.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}

