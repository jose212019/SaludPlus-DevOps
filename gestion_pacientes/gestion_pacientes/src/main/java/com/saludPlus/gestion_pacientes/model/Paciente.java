package com.saludPlus.gestion_pacientes.model; // Corregido: 'p' minúscula en pacientes

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({ "id_paciente", "rut", "nombre", "apellido", "edad", "sexo", "afiliacion", "fechaNacimiento" })
public class Paciente {
    private Long id_paciente;
    private String rut;
    private String nombre;
    private String apellido;
    private Integer edad;
    private String sexo;
    private String afiliacion;
    private String fechaNacimiento;
}