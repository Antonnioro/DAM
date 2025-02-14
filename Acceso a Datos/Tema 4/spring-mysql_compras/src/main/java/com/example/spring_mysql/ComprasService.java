package com.example.spring_mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComprasService {

    @Autowired
    private ComprasRepository comprasRepository;

    public List<Compras> obtenerTodos() {
        return comprasRepository.findAll();
    }

    public Compras obtenerPorId(Integer id) {
        return comprasRepository.findById(id).orElse(null);
    }

    public Compras guardarCompras(Compras compras) {
        return comprasRepository.save(compras);
    }

    public void eliminarCompras(Integer id) {
        comprasRepository.deleteById(id);
    }
}
