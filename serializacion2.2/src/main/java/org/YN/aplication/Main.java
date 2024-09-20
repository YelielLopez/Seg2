package org.YN.aplication;



import org.YN.aplication.service.EmpleadoService;
import org.YN.aplication.service.TareaService;
import org.YN.domain.Empleado;
import org.YN.domain.Tarea;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    private static EmpleadoService empleadoService = new EmpleadoService();
    private static TareaService tareaService = new TareaService();
    private static List<Empleado> empleados = new ArrayList<>();
    private static List<Tarea> tareas = new ArrayList<>();

    public static void main(String[] args) {
        empleados = empleadoService.obtenerEmpleados();
        tareas = tareaService.obtenerTareas(empleados);

        boolean salir = false;
        while (!salir) {
            String opcion = JOptionPane.showInputDialog(null,
                    "Menú Principal\n" +
                            "1. Mostrar Empleados\n" +
                            "2. Agregar Empleado\n" +
                            "3. Asignar Tarea\n" +
                            "4. Mostrar Tareas\n" +
                            "5. Actualizar Estado de Tarea\n" +
                            "6. Salir\n" +
                            "Seleccione una opción:");

            switch (opcion) {
                case "1":
                    mostrarEmpleados();
                    break;
                case "2":
                    agregarEmpleado();
                    break;
                case "3":
                    asignarTarea();
                    break;
                case "4":
                    mostrarTareas();
                    break;
                case "5":
                    actualizarEstadoTarea();
                    break;
                case "6":
                    salir = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }

        empleadoService.guardarEmpleados(empleados);
        tareaService.guardarTareas(tareas);
    }

    private static void mostrarEmpleados() {
        StringBuilder sb = new StringBuilder("Empleados:\n");
        for (Empleado empleado : empleados) {
            sb.append(empleado.getNombre()).append(" ").append(empleado.getApellido()).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    private static void agregarEmpleado() {
        String nombre = JOptionPane.showInputDialog("Nombre:");
        String apellido = JOptionPane.showInputDialog("Apellido:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad:"));
        String cargo = JOptionPane.showInputDialog("Cargo:");
        String departamento = JOptionPane.showInputDialog("Departamento:");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Salario:"));

        Empleado nuevoEmpleado = new Empleado(nombre, apellido, edad, cargo, departamento, salario);
        empleados.add(nuevoEmpleado);
        JOptionPane.showMessageDialog(null, "Empleado agregado con éxito.");
    }

    private static void asignarTarea() {
        String nombreEmpleado = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
        Empleado empleado = empleadoService.buscarEmpleadoPorNombre(nombreEmpleado, empleados);

        if (empleado != null) {
            String titulo = JOptionPane.showInputDialog("Título de la tarea:");
            String descripcion = JOptionPane.showInputDialog("Descripción:");
            Date fechaInicio = new Date(); // Puedes pedir fecha al usuario
            Date fechaFin = new Date();    // Puedes pedir fecha al usuario
            String estado = "Pendiente";

            Tarea nuevaTarea = new Tarea(titulo, descripcion, fechaInicio, fechaFin, estado, empleado);
            tareaService.asignarTarea(nuevaTarea, tareas);
            JOptionPane.showMessageDialog(null, "Tarea asignada con éxito.");
        } else {
            JOptionPane.showMessageDialog(null, "Empleado no encontrado.");
        }
    }

    private static void mostrarTareas() {
        StringBuilder sb = new StringBuilder("Tareas:\n");
        for (Tarea tarea : tareas) {
            sb.append("Título: ").append(tarea.getTitulo()).append("\n")
                    .append("Descripción: ").append(tarea.getDescripcion()).append("\n")
                    .append("Empleado: ").append(tarea.getEmpleado().getNombre()).append("\n")
                    .append("Estado: ").append(tarea.getEstado()).append("\n\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    private static void actualizarEstadoTarea() {
        String titulo = JOptionPane.showInputDialog("Ingrese el título de la tarea a actualizar:");
        for (Tarea tarea : tareas) {
            if (tarea.getTitulo().equalsIgnoreCase(titulo)) {
                String nuevoEstado = JOptionPane.showInputDialog("Nuevo estado:");
                tareaService.actualizarEstadoTarea(tarea, nuevoEstado, tareas);
                JOptionPane.showMessageDialog(null, "Estado actualizado con éxito.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Tarea no encontrada.");
    }
}
