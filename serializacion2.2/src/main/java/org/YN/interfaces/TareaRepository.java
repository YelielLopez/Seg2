package org.YN.interfaces;


import org.YN.domain.Empleado;
import org.YN.domain.Tarea;

import java.util.List;

public interface TareaRepository {
    List<Tarea> cargarTareas(List<Empleado> empleados);
    void guardarTareas(List<Tarea> tareas);
}
