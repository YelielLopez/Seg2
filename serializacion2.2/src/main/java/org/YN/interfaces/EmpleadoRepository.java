package org.YN.interfaces;


import org.YN.domain.Empleado;

import java.util.List;

public interface EmpleadoRepository {
    List<Empleado> cargarEmpleados();
    void guardarEmpleados(List<Empleado> empleados);

    void save(Empleado empleado);

    Empleado findById(int id);

    List<Empleado> findAll();

    void update(Empleado empleado);

    void delete(int id);
}
