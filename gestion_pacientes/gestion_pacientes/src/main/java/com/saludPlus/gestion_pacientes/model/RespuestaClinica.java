package com.saludPlus.gestion_pacientes.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RespuestaClinica {
    private List<Paciente> registros_pacientes;
}