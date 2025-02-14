package com.example.spring_mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TVideojuegosService {

    @Autowired
    private TVideojuegosRepository tvideojuegosRepository;

    public List<TVideojuegos> obtenerTodos() {
        return tvideojuegosRepository.findAll();
    }

    public TVideojuegos obtenerPorId(Integer id) {
        return tvideojuegosRepository.findById(id).orElse(null);
    }

    public TVideojuegos guardarTVideojuegos(TVideojuegos tvideojuegos) {
        return tvideojuegosRepository.save(tvideojuegos);
    }

    public void eliminarTVideojuegos(Integer id) {
    	tvideojuegosRepository.deleteById(id);
    }
}
