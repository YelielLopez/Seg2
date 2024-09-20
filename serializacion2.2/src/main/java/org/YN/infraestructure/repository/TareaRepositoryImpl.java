package org.YN.infraestructure.repository;


import org.YN.domain.Empleado;
import org.YN.domain.Tarea;
import org.YN.interfaces.TareaRepository;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TareaRepositoryImpl implements TareaRepository {
    private static final String ARCHIVO_TAREAS = "tareas.dat";
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public List<Tarea> cargarTareas(List<Empleado> empleados) {
        List<Tarea> tareas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO_TAREAS))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                String titulo = datos[0];
                String descripcion = datos[1];
                Date fechaInicio = dateFormat.parse(datos[2]);
                Date fechaFin = dateFormat.parse(datos[3]);
                String estado = datos[4];
                Empleado empleado = buscarEmpleadoPorNombre(empleados, datos[5]);
                if (empleado != null) {
                    Tarea tarea = new Tarea(titulo, descripcion, fechaInicio, fechaFin, estado, empleado);
                    tareas.add(tarea);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tareas;
    }

    @Override
    public void guardarTareas(List<Tarea> tareas) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO_TAREAS))) {
            for (Tarea tarea : tareas) {
                bw.write(tarea.getTitulo() + "," + tarea.getDescripcion() + "," +
                        dateFormat.format(tarea.getFechaInicio()) + "," +
                        dateFormat.format(tarea.getFechaFin()) + "," +
                        tarea.getEstado() + "," + tarea.getEmpleado().getNombre());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Empleado buscarEmpleadoPorNombre(List<Empleado> empleados, String nombreEmpleado) {
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equals(nombreEmpleado)) {
                return empleado;
            }
        }
        return null;
    }
}
