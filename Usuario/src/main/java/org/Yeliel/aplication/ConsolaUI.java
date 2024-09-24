package org.Yeliel.aplication;

import org.Yeliel.aplication.service.UsuarioService;
import org.Yeliel.domain.Usuario;

import javax.swing.*;
import java.util.Scanner;

public class ConsolaUI {
    private final UsuarioService usuarioService;

    public ConsolaUI(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    public void iniciar() {
        while (true) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                    --- CRUD de Usuarios ---
                    1. Crear usuario
                    2. Buscar usuario
                    3. Listar usuarios
                    4. Actualizar contraseña
                    5. Eliminar usuario
                    6. Salir
                    Seleccione una opción:\s"""));

            switch (opcion) {
                case 1:
                    crearUsuario();
                    break;
                case 2:
                    buscarUsuario();
                    break;
                case 3:
                    listarUsuarios();
                    break;
                case 4:
                    actualizarContraseña();
                    break;
                case 5:
                    eliminarUsuario();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null,"Gracias por usar el sistema. ¡Hasta luego!");
                    return;
                default:
                    JOptionPane.showMessageDialog(null,"Opción no válida. Intente de nuevo.");
            }
        }
    }

    private void crearUsuario() {
        String correo = JOptionPane.showInputDialog("Ingrese el correo del nuevo usuario: ");

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del nuevo usuario: ");

        String contraseña = JOptionPane.showInputDialog("Cree la contraseña del nuevo ususario: ");

        Usuario usuario = new Usuario(nombre, contraseña, correo);


        usuarioService.crearUsuario(usuario);
        System.out.println("Usuario creado exitosamente.");
    }

    private void buscarUsuario() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del usuario a buscar: ");

        Usuario usuario = usuarioService.obtenerUsuario(nombre);
        if (usuario != null) {
            System.out.println(usuario);
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }

    private void listarUsuarios() {
        System.out.println("Lista de usuarios:");
        usuarioService.listarUsuarios().forEach(System.out::println);
    }

    private void actualizarContraseña() {
        String nombre = JOptionPane.showInputDialog("Ingrese el Nombre del usuario al que actualizará la contraseña: ");


        Usuario usuario = usuarioService.obtenerUsuario(nombre);
        if (usuario != null) {
            String nuevaContraseña = JOptionPane.showInputDialog("Ingrese la nueva contraseña del usuario: ");

            usuario.setContraseña(nuevaContraseña);

            usuarioService.actualizarContraseña(usuario);
            System.out.println("Usuario actualizado exitosamente.");
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }

    private void eliminarUsuario() {
        String nombre =JOptionPane.showInputDialog("Ingrese el nombre del usuario a eliminar: ");
        usuarioService.eliminarUsuario(nombre);
        System.out.println("Usuario eliminado exitosamente.");
    }
}