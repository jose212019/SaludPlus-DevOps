package com.saludPlus.gestion_pacientes.controller;
import com.saludPlus.gestion_pacientes.model.Paciente;
import com.saludPlus.gestion_pacientes.model.RespuestaClinica;
import com.saludPlus.gestion_pacientes.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService service;

    @PostMapping
    public ResponseEntity<?> registrar(@RequestBody Paciente p) {
        try {
            return ResponseEntity.status(201).body(service.registrar(p));
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<RespuestaClinica> listar() {
        List<Paciente> lista = service.listarPacientes();
        return ResponseEntity.ok(new RespuestaClinica(lista));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> editar(@PathVariable Long id, @RequestBody Paciente p) {
        Paciente actualizado = service.editarPaciente(id, p);
        return (actualizado != null) ? ResponseEntity.ok(actualizado) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminar(@PathVariable Long id) {
        return service.borrarPaciente(id)
            ? ResponseEntity.ok("Paciente eliminado con exito")
            : ResponseEntity.status(404).body("paciente No encontrado");
    }
}