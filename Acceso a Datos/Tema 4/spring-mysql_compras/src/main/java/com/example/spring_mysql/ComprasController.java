package com.example.spring_mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/compras")
public class ComprasController {

    @Autowired
    private ComprasService comprasService;

    @GetMapping
    public List<Compras> obtenerTodos() {
        return comprasService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Compras obtenerPorId(@PathVariable Integer id) {
        return comprasService.obtenerPorId(id);
    }

    @PostMapping
    public Compras guardarCompras(@RequestBody Compras compras) {
        return comprasService.guardarCompras(compras);
    }

    @DeleteMapping("/{id}")
    public void eliminarCompras(@PathVariable Integer id) {
    	comprasService.eliminarCompras(id);
    }
}
