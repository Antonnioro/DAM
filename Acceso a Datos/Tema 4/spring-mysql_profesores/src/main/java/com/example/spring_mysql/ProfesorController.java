package com.example.spring_mysql;

import com.example.spring_mysql.Profesor;
import com.example.spring_mysql.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profesores")
public class ProfesorController {

    @Autowired
    private ProfesorService profesorService;

    @GetMapping
    public List<Profesor> obtenerTodos() {
        return profesorService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Profesor obtenerPorId(@PathVariable Long id) {
        return profesorService.obtenerPorId(id);
    }

    @PostMapping
    public Profesor guardarProfesor(@RequestBody Profesor profesor) {
        return profesorService.guardarProfesor(profesor);
    }

    @DeleteMapping("/{id}")
    public void eliminarProfesor(@PathVariable Long id) {
    	profesorService.eliminarProfesor(id);
    }
}
