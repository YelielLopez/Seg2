package org.YN.aplication.service;



import org.YN.domain.Empleado;
import org.YN.domain.Tarea;
import org.YN.infraestructure.repository.TareaRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class TareaService {
    private TareaRepositoryImpl tareaRepo = new TareaRepositoryImpl();

    // Obtener todas las tareas
    public List<Tarea> obtenerTareas(List<Empleado> empleados) {
        return tareaRepo.cargarTareas(empleados);
    }

    // Asignar nueva tarea
    public void asignarTarea(Tarea tarea, List<Tarea> tareasExistentes) {
        tareasExistentes.add(tarea);
        guardarTareas(tareasExistentes);
    }

    // Actualizar estado de una tarea existente
    public void actualizarEstadoTarea(Tarea tarea, String nuevoEstado, List<Tarea> tareasExistentes) {
        tarea.setEstado(nuevoEstado);
        guardarTareas(tareasExistentes);
    }

    // Obtener tareas asignadas a un empleado
    public List<Tarea> obtenerTareasPorEmpleado(Empleado empleado, List<Tarea> tareasExistentes) {
        List<Tarea> tareasEmpleado = new ArrayList<>();
        for (Tarea tarea : tareasExistentes) {
            if (tarea.getEmpleado().equals(empleado)) {
                tareasEmpleado.add(tarea);
            }
        }
        return tareasEmpleado;
    }

    // Eliminar una tarea de la lista existente
    public void eliminarTarea(Tarea tarea, List<Tarea> tareasExistentes) {
        tareasExistentes.remove(tarea);
        guardarTareas(tareasExistentes);
    }

    // Guardar todas las tareas en el archivo
    public void guardarTareas(List<Tarea> tareasExistentes) {
        tareaRepo.guardarTareas(tareasExistentes);
    }
}

