package com.example.spring_mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FabricanteService {

    @Autowired
    private FabricanteRepository fabricanteRepository;

    public List<Fabricante> obtenerTodos() {
        return fabricanteRepository.findAll();
    }

    public Fabricante obtenerPorId(Integer id) {
        return fabricanteRepository.findById(id).orElse(null);
    }

    public Fabricante guardarFabricante(Fabricante fabricante) {
        return fabricanteRepository.save(fabricante);
    }

    public void eliminarFabricante(Integer id) {
    	fabricanteRepository.deleteById(id);
    }
}
