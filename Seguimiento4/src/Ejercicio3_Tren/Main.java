package Ejercicio3_Tren;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Asiento> asientosEconomicos = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            asientosEconomicos.add(new Asiento(i));
        }

        List<Vagon> vagonesTren1 = new ArrayList<>();
        vagonesTren1.add(new Vagon("Económica", 50, asientosEconomicos));

        Tren tren1 = new Tren("12345", "Ciudad A - Ciudad B", vagonesTren1);

        Viaje viaje1 = new Viaje("2024-08-20", "08:00", "12:00", tren1);

        List<Viaje> viajesDisponibles = new ArrayList<>();
        viajesDisponibles.add(viaje1);


        Cliente cliente = new Cliente("Juan Perez", 12345678, "Calle Falsa 123");


        boolean continuar = true;
        while (continuar) {

            StringBuilder infoViajes = new StringBuilder();
            for (Viaje viaje : viajesDisponibles) {
                infoViajes.append("Fecha: ").append(viaje.obtenerFecha())
                        .append("\nHora de Salida: ").append(viaje.obtenerHoraSalida())
                        .append("\nRuta: ").append(viaje.obtenerTren().obtenerRuta())
                        .append("\n\n");
            }

            String[] opciones = {"Buscar Viaje", "Reservar Asiento", "Comprar Boleto", "Salir"};
            int eleccion = JOptionPane.showOptionDialog(null, "Información de Viajes:\n" + infoViajes +
                            "Selecciona una opción", "Sistema de Compra de Boletos",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (eleccion) {
                case 0:

                    String fechaBusqueda = JOptionPane.showInputDialog("Ingresa la fecha del viaje (YYYY-MM-DD):");
                    Viaje viajeEncontrado = null;
                    for (Viaje viaje : viajesDisponibles) {
                        if (viaje.obtenerFecha().equals(fechaBusqueda)) {
                            viajeEncontrado = viaje;
                            break;
                        }
                    }

                    if (viajeEncontrado != null) {
                        JOptionPane.showMessageDialog(null, "Viaje encontrado:\nRuta: " +
                                viajeEncontrado.obtenerTren().obtenerRuta() + "\nHora de Salida: " +
                                viajeEncontrado.obtenerHoraSalida());
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró un viaje en esa fecha.");
                    }
                    break;

                case 1:

                    if (viaje1 != null) {
                        String numeroAsiento = JOptionPane.showInputDialog("Ingresa el número de asiento a reservar:");
                        Asiento asiento = tren1.obtenerVagon("Económica").obtenerAsiento(Integer.parseInt(numeroAsiento));

                        if (asiento != null && asiento.obtenerEstado().equals("disponible")) {
                            asiento.reservar();
                            JOptionPane.showMessageDialog(null, "Asiento " + numeroAsiento + " reservado exitosamente.");
                        } else {
                            JOptionPane.showMessageDialog(null, "El asiento no está disponible.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Primero debes buscar un viaje.");
                    }
                    break;

                case 2:

                    if (viaje1 != null) {
                        String numeroAsientoCompra = JOptionPane.showInputDialog("Ingresa el número de asiento a comprar:");
                        Asiento asientoCompra = tren1.obtenerVagon("Económica").obtenerAsiento(Integer.parseInt(numeroAsientoCompra));

                        if (asientoCompra != null && asientoCompra.obtenerEstado().equals("reservado")) {
                            asientoCompra.ocupar();
                            Boleto boleto = new Boleto(cliente, viaje1, asientoCompra);
                            cliente.agregarBoleto(boleto);
                            JOptionPane.showMessageDialog(null, "Boleto comprado exitosamente para el asiento " + numeroAsientoCompra + ".");
                        } else {
                            JOptionPane.showMessageDialog(null, "El asiento no está reservado.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Primero debes buscar un viaje.");
                    }
                    break;

                case 3:

                    continuar = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }
    }
}
