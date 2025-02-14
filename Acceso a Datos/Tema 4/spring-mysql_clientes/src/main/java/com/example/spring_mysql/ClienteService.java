package com.example.spring_mysql;

import com.example.spring_mysql.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository pacienteRepository;
    
    public List<Cliente> obtenerTodos() {
        return pacienteRepository.findAll();
    }

    public Cliente obtenerPorId(Integer id) {
        return pacienteRepository.findById(id).orElse(null);
    }

    public Cliente guardarPaciente(Cliente paciente) {
        return pacienteRepository.save(paciente);
    }

    public void eliminarPaciente(Integer id) {
    	pacienteRepository.deleteById(id);
    }
	
}
