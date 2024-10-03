package org.example.Aplication;

import org.example.Aplication.Services.CitaService;
import org.example.Aplication.Services.PacienteService;
import org.example.Domain.Cita;
import org.example.Domain.Paciente;

import javax.swing.*;

public class Menu {
    private  final PacienteService pacienteService;
    private  final CitaService citaService;


    public Menu(PacienteService pacienteService, CitaService citaService) {
        this.pacienteService = pacienteService;
        this.citaService = citaService;
    }


    public void iniciar(){
        while (true){
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                    ---Seleccione una opción---:
                    1. Registrar paciente"
                    2. Borrar paciente del sistema
                    3. Actualizar datos de pacientes en el sistema
                    4. Asignar cita a paciente
                    5. Eliminar cita de paciente
                    6. Ver lista de pacientes
                    7. Ver lista de citas
                    8. Buscar paciente por id
                    9.Salir del programa"""));

            switch (opcion) {
                case 1:
                    crearPaciente();
                    break;
                case 2:
                    eliminarPaciente();
                    break;
                case 3:
                    actualizarPaciente();
                    break;
                case 4:
                    asignarCitaPaciente();
                    break;
                case 5:
                    eliminarCitaPaciente();
                    break;
                case 6:
                    verListaPacientes();
                    break;
                case 7:
                    verListaCitas();
                    break;
                case 8:
                    buscarPaciente();
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null,"Gracias por usar el sistema. ¡Hasta luego!");
                    return;

                default:
                    JOptionPane.showMessageDialog(null,"Opción no válida. Intente de nuevo.");

            }
        }


    }
    public void crearPaciente(){
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del paciente: "));
        String nombrePaciente = JOptionPane.showInputDialog("Ingrese el nombre del paciente: ");
        String apellidoPaciente = JOptionPane.showInputDialog("Ingrese el apellido del paciente: ");
        int edadPaciente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del paciente: "));
        int telefonoPaciente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el telefono del paciente: "));
        String generoPaciente = JOptionPane.showInputDialog("Ingrese el genero del paciente: ");

        Paciente paciente = new Paciente(id,nombrePaciente,apellidoPaciente,edadPaciente,telefonoPaciente,generoPaciente);

        pacienteService.crear(paciente);
        JOptionPane.showMessageDialog(null, "Paciente creado con exito");
    }

    public void eliminarPaciente(){
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del paciente a eliminar: "));

        Paciente paciente = pacienteService.buscarPacientePorId(id);

        if(paciente != null){
            pacienteService.eliminarPaciente(id);
            JOptionPane.showMessageDialog(null, "Paciente borrado con exito");
        }
        else JOptionPane.showMessageDialog(null,"Paciente no encontrado");

    }

    public void actualizarPaciente(){
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del paciente para actualizar sus datos: "));

        Paciente paciente = pacienteService.buscarPacientePorId(id);

        if(paciente != null){
            while (true){

                int opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                        ---Elija una opcion valida---
                        1. Actualizar nombre
                        2. Actualizar Apellido
                        3. Actualizar edad
                        4. Actualizar telefono
                        5. Actualizar genero
                        6. Actulizar todos los datos
                        7. Regresar a pantalla de inicio"""));


                switch (opcion){
                    case 1: {
                        String nuevoNombrePaciente = JOptionPane.showInputDialog("Ingrese el nuevo nombre del paciente: ");
                        paciente.setNombre(nuevoNombrePaciente);
                        pacienteService.actualizarPaciente(paciente);
                        JOptionPane.showMessageDialog(null,"Nombre actualizado con exito");
                        break;
                    }
                    case 2: {
                        String nuevoApellidoPaciente = JOptionPane.showInputDialog("Ingrese el nuevo apellido del paciente: ");
                        paciente.setApellido(nuevoApellidoPaciente);
                        pacienteService.actualizarPaciente(paciente);
                        JOptionPane.showMessageDialog(null,"Apellido actualizado con exito");
                        break;
                    }
                    case 3: {
                        int nuevaEdadPaciente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva  edad del paciente: "));
                        paciente.setEdad(nuevaEdadPaciente);
                        pacienteService.actualizarPaciente(paciente);
                        JOptionPane.showMessageDialog(null,"Edad actualizada con exito");
                        break;
                    }
                    case 4: {
                        int nuevoTelefonoPaciente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo telefono del paciente: "));
                        paciente.setTelefono(nuevoTelefonoPaciente);
                        pacienteService.actualizarPaciente(paciente);
                        JOptionPane.showMessageDialog(null,"Telefono actualizado con exito");
                        break;
                    }
                    case 5: {
                        String nuevoGeneroPaciente = JOptionPane.showInputDialog("Ingrese el nuevo genero del paciente: ");
                        paciente.setGenero(nuevoGeneroPaciente);
                        pacienteService.actualizarPaciente(paciente);
                        JOptionPane.showMessageDialog(null,"Genero actualizado con exito");
                        break;
                    }
                    case 6: {
                        String nuevoNombrePaciente = JOptionPane.showInputDialog("Ingrese el nuevo nombre del paciente: ");
                        paciente.setNombre(nuevoNombrePaciente);

                        String nuevoApellidoPaciente = JOptionPane.showInputDialog("Ingrese el nuevo apellido del paciente: ");
                        paciente.setApellido(nuevoApellidoPaciente);

                        int nuevaEdadPaciente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva  edad del paciente: "));
                        paciente.setEdad(nuevaEdadPaciente);

                        int nuevoTelefonoPaciente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo telefono del paciente: "));
                        paciente.setTelefono(nuevoTelefonoPaciente);

                        String nuevoGeneroPaciente = JOptionPane.showInputDialog("Ingrese el genero del paciente: ");
                        paciente.setGenero(nuevoGeneroPaciente);

                        pacienteService.actualizarPaciente(paciente);
                        break;
                    }
                    case 7: return;
                    default: JOptionPane.showMessageDialog(null, "Opcion no valida");
                }
            }
        } else JOptionPane.showMessageDialog(null,"Paciente no encontrado");
    }


    public void verListaPacientes(){
        System.out.println("Lista de pacientes: \n");
        pacienteService.listarPacientes().forEach(System.out::println);
    }

    public void buscarPaciente(){
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del paciente para realizar la busqueda: "));

        Paciente paciente = pacienteService.buscarPacientePorId(opcion);

        if (paciente != null){
            JOptionPane.showMessageDialog(null, paciente.toString());
        }
        else JOptionPane.showMessageDialog(null,"Paciente no encontrado");
    }

    public void asignarCitaPaciente(){
        String titulo = JOptionPane.showInputDialog("Ingrese un titulo para la cita");
        String fecha = JOptionPane.showInputDialog("Ingrese la fecha para la cita. formato d/m/a");
        String hora = JOptionPane.showInputDialog("Ingrese la hora para la cita. formato 24 horas");
        String motivo = JOptionPane.showInputDialog("Ingrese el motivo para la cita");


        while (true){
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del paciente para asignarle la cita: "));
            Paciente paciente = pacienteService.buscarPacientePorId(id);

            if (paciente != null){
                Cita cita = new Cita(titulo, fecha, hora, motivo,paciente);
                citaService.crearCita(cita);
                JOptionPane.showMessageDialog(null,"Cita creada y asignada exitosamente ");
                return;

            } else JOptionPane.showMessageDialog(null,"Paciente no encontrado");


        }
    }


    public void eliminarCitaPaciente(){
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del cita para borrarla: "));

        citaService.eliminarCita(id);
        JOptionPane.showMessageDialog(null,"Cita elimada exitosamente");

    }


    public void verListaCitas(){
        System.out.println("Lista de citas");
        citaService.listarCitas().forEach(System.out::println);
    }


}
