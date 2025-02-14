package com.example.demo.repository;

import com.example.demo.entity.Medicos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicosRepository extends JpaRepository<Medicos, Integer> {
}
