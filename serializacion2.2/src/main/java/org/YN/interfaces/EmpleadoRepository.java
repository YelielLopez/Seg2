package org.YN.interfaces;


import org.YN.domain.Empleado;

import java.util.List;

public interface EmpleadoRepository {
    List<Empleado> cargarEmpleados();
    void guardarEmpleados(List<Empleado> empleados);
}
