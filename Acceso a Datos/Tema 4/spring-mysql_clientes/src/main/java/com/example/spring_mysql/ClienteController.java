package com.example.spring_mysql;

import com.example.spring_mysql.Cliente;
import com.example.spring_mysql.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

	@Autowired
	private ClienteService pacienteService;
	
	@GetMapping
    public List<Cliente> obtenerTodos() {
        return pacienteService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Cliente obtenerPorId(@PathVariable Integer id) {
        return pacienteService.obtenerPorId(id);
    }

    @PostMapping
    public Cliente guardarProfesor(@RequestBody Cliente paciente) {
        return pacienteService.guardarPaciente(paciente);
    }

    @DeleteMapping("/{id}")
    public void eliminarPaciente(@PathVariable Integer id) {
    	pacienteService.eliminarPaciente(id);
    }

}
