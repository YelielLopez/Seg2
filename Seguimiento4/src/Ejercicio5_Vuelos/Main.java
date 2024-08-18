package Ejercicio5_Vuelos;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Asiento> asientosEconomicos = new ArrayList<>();
        for (int i = 1; i <= 30; i++) {
            asientosEconomicos.add(new Asiento(i, "Económica"));
        }

        Avion avion1 = new Avion("Boeing 737", 30, asientosEconomicos);

        Vuelo vuelo1 = new Vuelo("AB1234", "Ciudad X - Ciudad Y", "2024-08-25", "10:00", "12:00", avion1);

        List<Vuelo> vuelosDisponibles = new ArrayList<>();
        vuelosDisponibles.add(vuelo1);


        Pasajero pasajero = new Pasajero("Ana López", 98765432, "ana@example.com");


        boolean continuar = true;
        while (continuar) {

            StringBuilder infoVuelos = new StringBuilder();
            for (Vuelo vuelo : vuelosDisponibles) {
                infoVuelos.append("Número de Vuelo: ").append(vuelo.obtenerNumero())
                        .append("\nRuta: ").append(vuelo.obtenerRuta())
                        .append("\nFecha: ").append(vuelo.obtenerFecha())
                        .append("\nHora de Salida: ").append(vuelo.obtenerHoraSalida())
                        .append("\nHora de Llegada: ").append(vuelo.obtenerHoraLlegada())
                        .append("\n\n");
            }

            String[] opciones = {"Buscar Vuelo", "Reservar Asiento", "Comprar Ticket", "Salir"};
            int eleccion = JOptionPane.showOptionDialog(null, "Información de Vuelos:\n" + infoVuelos +
                            "Selecciona una opción", "Sistema de Reservas de Vuelos",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (eleccion) {
                case 0:

                    String fechaBusqueda = JOptionPane.showInputDialog("Ingresa la fecha del vuelo (YYYY-MM-DD):");
                    Vuelo vueloEncontrado = null;
                    for (Vuelo vuelo : vuelosDisponibles) {
                        if (vuelo.obtenerFecha().equals(fechaBusqueda)) {
                            vueloEncontrado = vuelo;
                            break;
                        }
                    }

                    if (vueloEncontrado != null) {
                        JOptionPane.showMessageDialog(null, "Vuelo encontrado:\nNúmero: " +
                                vueloEncontrado.obtenerNumero() + "\nRuta: " +
                                vueloEncontrado.obtenerRuta() + "\nHora de Salida: " +
                                vueloEncontrado.obtenerHoraSalida());
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró un vuelo en esa fecha.");
                    }
                    break;

                case 1:

                    String numeroAsiento = JOptionPane.showInputDialog("Ingresa el número de asiento a reservar:");
                    Asiento asiento = avion1.obtenerAsiento(Integer.parseInt(numeroAsiento));

                    if (asiento != null && asiento.obtenerEstado().equals("disponible")) {
                        asiento.reservar();
                        JOptionPane.showMessageDialog(null, "Asiento " + numeroAsiento + " reservado exitosamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "El asiento no está disponible.");
                    }
                    break;

                case 2:

                    String numeroAsientoCompra = JOptionPane.showInputDialog("Ingresa el número de asiento a comprar:");
                    Asiento asientoCompra = avion1.obtenerAsiento(Integer.parseInt(numeroAsientoCompra));

                    if (asientoCompra != null && asientoCompra.obtenerEstado().equals("reservado")) {
                        asientoCompra.ocupar();
                        Reserva reserva = new Reserva(pasajero, vuelo1, asientoCompra);
                        pasajero.agregarReserva(reserva);
                        JOptionPane.showMessageDialog(null, "Ticket comprado exitosamente para el asiento " + numeroAsientoCompra + ".");
                    } else {
                        JOptionPane.showMessageDialog(null, "El asiento no está reservado.");
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
