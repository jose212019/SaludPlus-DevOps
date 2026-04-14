# Proyecto SaludPlus - Gestión de Pacientes

Este es el repositorio del backend para el sistema de gestión clínica SaludPlus, desarrollado para la asignatura de FullStack y DevOps. El objetivo es centralizar la lógica de negocio de los pacientes mediante una API REST funcional.

## Especificaciones Técnicas
* **Lenguaje:** Java 25 (Versión más reciente)
* **Framework:** Spring Boot 3.5.x
* **Gestión de Dependencias:** Maven
* **CI/CD:** GitHub Actions para integración continua.

## Estructura del Trabajo 
El proyecto sigue un flujo de trabajo organizado por ramas para asegurar la estabilidad del código:
* **Rama main**: Contiene la versión estable y lista para producción.
* **Rama develop**: Rama de integración donde se consolidan las funcionalidades en desarrollo.
* **Workflows**: Configuración de automatización en el directorio .github/workflow.

## Estado de Integración Continua (CI)
![Pipeline Status](https://github.com/jose212019/SaludPlus-DevOps/actions/workflows/main.yml/badge.svg)

El proyecto cuenta con un pipeline automatizado que valida la compilación del código en cada commit. Si el indicador de arriba marca **"passing"**, significa que el código es válido y compila sin errores.

---
**Desarrollado por:** Jose Cuevas y Salvador Briceño  
**Carrera:** Ingeniería en Informática  
**Institución:** Duoc UC  
**Contacto:** jb.cuevas@duocuc.cl
