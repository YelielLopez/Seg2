package Tienda;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> listaProductos = new ArrayList<>();
        JOptionPane.showMessageDialog(null,"Buenos Dias y Bienvenido a  Tienda EL Zafiro");

        while (true) {
            String input = JOptionPane.showInputDialog(null,
                    "Buenos Días, ¿qué acción desea realizar? \n 1. Productos Perecederos \n 2. Productos No Perecederos \n 3. Salir");

            int seleccion = parseInt(input);

            if (seleccion == 3) {
                break;
            }

            switch (seleccion) {
                case 1:
                    manejarProductosPerecederos(listaProductos);
                    break;
                case 2:
                    manejarProductosNoPerecederos(listaProductos);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }
    }

    private static void manejarProductosPerecederos(ArrayList<Producto> listaProductos) {
        String input = JOptionPane.showInputDialog(null,
                "Qué acción desea realizar con productos perecederos? \n 1. Agregar un Producto \n 2. Eliminar un Producto \n 3. Modificar un Producto");

        int seleccion = parseInt(input);

        switch (seleccion) {
            case 1:
                agregarProductoPerecedero(listaProductos);
                break;
            case 2:
                eliminarProducto(listaProductos);
                break;
            case 3:
                modificarProducto(listaProductos);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida.");
        }
    }

    private static void manejarProductosNoPerecederos(ArrayList<Producto> listaProductos) {
        String input = JOptionPane.showInputDialog(null,
                "Qué acción desea realizar con productos no perecederos? \n 1. Agregar un Producto \n 2. Eliminar un Producto \n 3. Modificar un Producto");

        int seleccion = parseInt(input);

        switch (seleccion) {
            case 1:
                agregarProductoNoPerecedero(listaProductos);
                break;
            case 2:
                eliminarProducto(listaProductos);
                break;
            case 3:
                modificarProducto(listaProductos);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida.");
        }
    }

    private static void agregarProductoPerecedero(ArrayList<Producto> listaProductos) {
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el Nombre:");
        String descripcion = JOptionPane.showInputDialog(null, "Ingrese la Descripción:");
        double precio = parseDouble(JOptionPane.showInputDialog(null, "Ingrese el Precio:"));
        int stock = parseInt(JOptionPane.showInputDialog(null, "Ingrese la Cantidad en Stock:"));

        int ano = parseInt(JOptionPane.showInputDialog(null, "Ingrese el Año de Vencimiento:"));
        int mes = parseInt(JOptionPane.showInputDialog(null, "Ingrese el Mes de Vencimiento (1-12):")) - 1;
        int dia = parseInt(JOptionPane.showInputDialog(null, "Ingrese el Día de Vencimiento:"));

        Calendar calendar = Calendar.getInstance();
        calendar.set(ano, mes, dia);
        Date fechaVencimiento = calendar.getTime();

        listaProductos.add(new ProductoPerecedero(nombre, descripcion, precio, stock, fechaVencimiento));
        JOptionPane.showMessageDialog(null, "Producto Perecedero Agregado con Éxito.");
    }

    private static void agregarProductoNoPerecedero(ArrayList<Producto> listaProductos) {
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el Nombre:");
        String descripcion = JOptionPane.showInputDialog(null, "Ingrese la Descripción:");
        double precio = parseDouble(JOptionPane.showInputDialog(null, "Ingrese el Precio:"));
        int stock = parseInt(JOptionPane.showInputDialog(null, "Ingrese la Cantidad en Stock:"));

        listaProductos.add(new Producto(nombre, descripcion, precio, stock));
        JOptionPane.showMessageDialog(null, "Producto No Perecedero Agregado con Éxito.");
    }

    private static void eliminarProducto(ArrayList<Producto> listaProductos) {
        String codigo = JOptionPane.showInputDialog(null, "Ingrese el Nombre del Producto a Eliminar:");

        Iterator<Producto> iterator = listaProductos.iterator();
        while (iterator.hasNext()) {
            Producto producto = iterator.next();
            if (producto.obtenerNombre().equals(codigo)) {
                iterator.remove();
                JOptionPane.showMessageDialog(null, "Producto Eliminado con Éxito.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Producto no encontrado.");
    }

    private static void modificarProducto(ArrayList<Producto> listaProductos) {
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el Nombre del Producto a Modificar:");

        for (Producto producto : listaProductos) {
            if (producto.obtenerNombre().equals(nombre)) {
                String nuevoNombre = JOptionPane.showInputDialog(null, "Ingrese el Nuevo Nombre (deje en blanco para no modificar):");
                String nuevaDescripcion = JOptionPane.showInputDialog(null, "Ingrese la Nueva Descripción (deje en blanco para no modificar):");
                String nuevoPrecioStr = JOptionPane.showInputDialog(null, "Ingrese el Nuevo Precio (deje en blanco para no modificar):");
                String nuevaCantidadStr = JOptionPane.showInputDialog(null, "Ingrese la Nueva Cantidad en Stock (deje en blanco para no modificar):");

                if (!nuevoNombre.isBlank()) producto.setNombre(nuevoNombre);
                if (!nuevaDescripcion.isBlank()) producto.setDescripcion(nuevaDescripcion);
                double nuevoPrecio = parseDouble(nuevoPrecioStr);
                if (nuevoPrecio > 0) producto.setPrecio(nuevoPrecio);
                int nuevaCantidad = parseInt(nuevaCantidadStr);
                if (nuevaCantidad > 0) producto.setStock(nuevaCantidad);

                JOptionPane.showMessageDialog(null, "Producto Modificado con Éxito.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Producto no encontrado.");
    }

    private static int parseInt(String input) {
        if (input != null && !input.isBlank()) {
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Asegúrese de ingresar un número entero.");
            }
        }
        return -1;
    }

    private static long parseLong(String input) {
        if (input != null && !input.isBlank()) {
            try {
                return Long.parseLong(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Asegúrese de ingresar un número largo.");
            }
        }
        return -1L;
    }

    private static double parseDouble(String input) {
        if (input != null && !input.isBlank()) {
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Asegúrese de ingresar un número decimal.");
            }
        }
        return -1;
    }
}