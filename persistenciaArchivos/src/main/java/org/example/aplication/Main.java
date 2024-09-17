package org.example.aplication;

import org.example.aplication.service.PacienteService;
import org.example.aplication.service.PacienteServiceImpl;
import org.example.domain.Paciente;
import org.example.infraestructure.repository.PacienteRepositoryImpl;
import org.example.interfaces.PacienteRepository;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final PacienteService PACIENTE_SERVICE;

    static {
        PacienteRepository pacienteRepository = new PacienteRepositoryImpl();
        PACIENTE_SERVICE = new PacienteServiceImpl(pacienteRepository);
    }

    public static void main(String[] args) {
        boolean salir = false;
        while (!salir) {
            System.out.println("1. Listar pacientes");
            System.out.println("2. Registrar pacientes");
            System.out.println("3. Actualizar pacientes");
            System.out.println("4. Eliminar pacientes");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    verPacientes();
                    break;
                case 2:
                    EnlistarPaciente();
                    break;
                case 3:
                    actualizarDatos();
                    break;
                case 4:
                    eliminarPaciente();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }

    private static void verPacientes() {
        List<Paciente> pacientes = PACIENTE_SERVICE.findAll();
        if (pacientes.isEmpty()) {
            System.out.println("No hay pacientes registrados.");
        } else {
            System.out.println("Listado de pacientes:");
            for (Paciente paciente : pacientes) {
                System.out.println(paciente);
            }
        }
    }

    private static void EnlistarPaciente() {
        System.out.print("Ingrese el ID del paciente: ");
        int cod  = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el nombre del paciente: ");
        String nombre = scanner.nextLine();


        Paciente paciente = new Paciente();
        paciente.setId(cod);
        paciente.setNombre(nombre);


        try {
            PACIENTE_SERVICE.save(paciente);
            System.out.println("Paciente enlistado exitosamente.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void actualizarDatos() {
        System.out.print("Ingrese el ID del paciente a actualizar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        Paciente paciente = PACIENTE_SERVICE.findById(id);
        if (paciente == null) {
            System.out.println("No se encontró el paciente con ID " + id);
            return;
        }

        System.out.print("Ingrese el nuevo nombre del paciente (dejar en blanco para no cambiar): ");
        String nombre = scanner.nextLine();
        if (!nombre.isEmpty()) {
            paciente.setNombre(nombre);
        }

        try {
            PACIENTE_SERVICE.update(paciente);
            System.out.println("Datos del paciente actualizado exitosamente.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void eliminarPaciente() {
        System.out.print("Ingrese el ID del paciente a eliminar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        Paciente paciente = PACIENTE_SERVICE.findById(id);
        if (paciente == null) {
            System.out.println("No se encontró el paciente con ID " + id);
            return;
        }

        PACIENTE_SERVICE.delete(id);
        System.out.println("Paciente eliminado exitosamente.");
    }
}
