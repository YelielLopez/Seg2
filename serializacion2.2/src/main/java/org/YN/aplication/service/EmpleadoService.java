package org.YN.aplication.service;


import org.YN.domain.Empleado;
import org.YN.infraestructure.repository.EmpleadoRepositoryImpl;

import java.util.List;

public class EmpleadoService {
    private EmpleadoRepositoryImpl empleadoRepo = new EmpleadoRepositoryImpl();

    // Obtener todos los empleados
    public List<Empleado> obtenerEmpleados() {
        return empleadoRepo.cargarEmpleados();
    }

    // Guardar todos los empleados
    public void guardarEmpleados(List<Empleado> empleados) {
        empleadoRepo.guardarEmpleados(empleados);
    }

    // Buscar empleado por nombre
    public Empleado buscarEmpleadoPorNombre(String nombre, List<Empleado> empleados) {
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equalsIgnoreCase(nombre)) {
                return empleado;
            }
        }
        return null;
    }
}
