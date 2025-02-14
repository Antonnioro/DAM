package com.example.spring_mysql;

import com.example.spring_mysql.Paciente;
import com.example.spring_mysql.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pacientes")
public class PacienteController {

	@Autowired
	private PacienteService pacienteService;
	
	@GetMapping
    public List<Paciente> obtenerTodos() {
        return pacienteService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Paciente obtenerPorId(@PathVariable Integer id) {
        return pacienteService.obtenerPorId(id);
    }

    @PostMapping
    public Paciente guardarProfesor(@RequestBody Paciente paciente) {
        return pacienteService.guardarPaciente(paciente);
    }

    @DeleteMapping("/{id}")
    public void eliminarPaciente(@PathVariable Integer id) {
    	pacienteService.eliminarPaciente(id);
    }

}
