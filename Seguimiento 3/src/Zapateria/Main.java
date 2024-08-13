package Seguimiento3.Zapateria;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Zapato[] zapatos = {
                new Zapato("Zapato1", "Cuero", "Negro", 100000, "Primavera 2024"),
                new Zapato("Zapato2", "Gamuza", "Marrón", 120000, "Verano 2024"),
                new Zapato("Zapato3", "Sintético", "Azul", 80000, "Otoño 2023"),
                new Zapato("Zapato4", "Cuero", "Blanco", 110000, "Invierno 2024"),
                new Zapato("Zapato5", "Textil", "Gris", 90000, "Primavera 2023")
        };

        List<Inventario> inventarios = new ArrayList<>();
        inventarios.add(new Inventario(zapatos[0], 42, 10));
        inventarios.add(new Inventario(zapatos[1], 43, 8));
        inventarios.add(new Inventario(zapatos[2], 41, 15));
        inventarios.add(new Inventario(zapatos[3], 44, 5));
        inventarios.add(new Inventario(zapatos[4], 40, 20));

        List<Venta> ventas = new ArrayList<>();
        ventas.add(new Venta("2024-08-11", zapatos[0], 42, 2));
        ventas.add(new Venta("2024-08-12", zapatos[2], 41, 5));
        ventas.add(new Venta("2024-08-13", zapatos[4], 40, 3));

        for (Venta venta : ventas) {
            for (Inventario inventario : inventarios) {
                if (inventario.getModelo().getNombre().equals(venta.getModelo().getNombre()) &&
                        inventario.getTalla() == venta.getTalla()) {
                    inventario.registrarSalida(venta.getCantidad());
                }
            }
        }
        JOptionPane.showMessageDialog(null,"Inventario Actual:");
        for (Inventario inventario : inventarios) {
            inventario.imprimirInventario();
        }
        JOptionPane.showMessageDialog(null,"\nDetalle de Ventas Realizadas:");
        for (Venta venta : ventas) {
            venta.imprimirDetalle();
        }
    }
}