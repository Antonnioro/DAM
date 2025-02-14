package com.example.spring_mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fabricante")
public class FabricanteController {

    @Autowired
    private FabricanteService fabricanteService;

    @GetMapping
    public List<Fabricante> obtenerTodos() {
        return fabricanteService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Fabricante obtenerPorId(@PathVariable Integer id) {
        return fabricanteService.obtenerPorId(id);
    }

    @PostMapping
    public Fabricante guardarFabricante(@RequestBody Fabricante fabricante) {
        return fabricanteService.guardarFabricante(fabricante);
    }

    @DeleteMapping("/{id}")
    public void eliminarFabricante(@PathVariable Integer id) {
    	fabricanteService.eliminarFabricante(id);
    }
}
