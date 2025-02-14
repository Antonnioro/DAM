package com.example.spring_mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tvideojuegos")
public class TVideojuegosController {

    @Autowired
    private TVideojuegosService tvideojuegosService;

    @GetMapping
    public List<TVideojuegos> obtenerTodos() {
        return tvideojuegosService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public TVideojuegos obtenerPorId(@PathVariable Integer id) {
        return tvideojuegosService.obtenerPorId(id);
    }

    @PostMapping
    public TVideojuegos guardarTVideojuegos(@RequestBody TVideojuegos tvideojuegos) {
        return tvideojuegosService.guardarTVideojuegos(tvideojuegos);
    }

    @DeleteMapping("/{id}")
    public void eliminarTVideojuegos(@PathVariable Integer id) {
    	tvideojuegosService.eliminarTVideojuegos(id);
    }
}
