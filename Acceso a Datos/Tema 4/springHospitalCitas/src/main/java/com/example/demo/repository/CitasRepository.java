package com.example.demo.repository;

import com.example.demo.entity.Citas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitasRepository extends JpaRepository<Citas, Integer> {
}
