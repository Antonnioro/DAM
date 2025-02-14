package com.example.demo.repository;

import com.example.demo.entity.Pacientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacientesRepository extends JpaRepository<Pacientes, Integer> {
}
