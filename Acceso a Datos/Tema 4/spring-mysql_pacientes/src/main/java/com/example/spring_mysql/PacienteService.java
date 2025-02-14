package com.example.spring_mysql;

import com.example.spring_mysql.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;
    
    public List<Paciente> obtenerTodos() {
        return pacienteRepository.findAll();
    }

    public Paciente obtenerPorId(Integer id) {
        return pacienteRepository.findById(id).orElse(null);
    }

    public Paciente guardarPaciente(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    public void eliminarPaciente(Integer id) {
    	pacienteRepository.deleteById(id);
    }
	
}
