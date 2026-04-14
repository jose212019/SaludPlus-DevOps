package com.saludPlus.gestion_pacientes.service;

import com.saludPlus.gestion_pacientes.model.Paciente; // Corregido: Ahora con Mayúscula
import com.saludPlus.gestion_pacientes.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository repository;

    public Paciente registrar(Paciente p) {
        if (p.getRut() == null || p.getRut().isBlank() || p.getNombre() == null || p.getNombre().isBlank()) {
            throw new RuntimeException("Error: RUT y Nombre son obligatorios.");
        }
        return repository.guardar(p);
    }

    public List<Paciente> listarPacientes() {
        return repository.obtenerTodos();
    }

    public Paciente editarPaciente(Long id, Paciente p) {
        return repository.actualizar(id, p);
    }

    public boolean borrarPaciente(Long id) {
        return repository.eliminar(id);
    }
}