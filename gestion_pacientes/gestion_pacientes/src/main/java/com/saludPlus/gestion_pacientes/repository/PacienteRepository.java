package com.saludPlus.gestion_pacientes.repository;

import com.saludPlus.gestion_pacientes.model.Paciente; 
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PacienteRepository {

    private List<Paciente> listaPacientes = new ArrayList<>();
    private Long proximoId = 1L;

    public Paciente guardar(Paciente p) {
        p.setId_paciente(proximoId++);
        listaPacientes.add(p);
        return p;
    }

    public List<Paciente> obtenerTodos() {
        return listaPacientes;
    }

    public boolean eliminar(Long id) {
        return listaPacientes.removeIf(p -> p.getId_paciente().equals(id));
    }

    public Paciente actualizar(Long id, Paciente nuevosDatos) {
        for (int i = 0; i < listaPacientes.size(); i++) {
            if (listaPacientes.get(i).getId_paciente().equals(id)) {
                nuevosDatos.setId_paciente(id);
                listaPacientes.set(i, nuevosDatos);
                return nuevosDatos;
            }
        }
        return null;
    }
}