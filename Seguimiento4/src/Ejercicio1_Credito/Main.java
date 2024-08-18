package Ejercicio1_Credito;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<SolicitudCredito> solicitudes = new ArrayList<>();
        Credito credito = null;
        CreditoHipotecario creditoHipotecario = null;


        String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
        String direccionCliente = JOptionPane.showInputDialog("Ingrese la dirección del cliente:");
        int identificacionCliente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la identificación del cliente:"));
        int ingresos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los ingresos del cliente:"));

        Cliente cliente = new Cliente(nombreCliente, direccionCliente, identificacionCliente, solicitudes, "", ingresos);

        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Menú:\n"
                    + "1. Solicitar crédito personal\n"
                    + "2. Solicitar crédito hipotecario\n"
                    + "3. Aprobar crédito\n"
                    + "4. Rechazar crédito\n"
                    + "5. Ver estado del crédito\n"
                    + "6. Ver historial crediticio\n"
                    + "7. Salir\n"
                    + "Ingrese una opción:"));

            switch (opcion) {
                case 1:

                    int montoPersonal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto del crédito personal:"));
                    String plazoPersonal = JOptionPane.showInputDialog("Ingrese el plazo del crédito personal:");
                    double tasaInteresPersonal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tasa de interés del crédito personal:"));
                    SolicitudCredito solicitudPersonal = new SolicitudCredito(cliente, "personal", montoPersonal, plazoPersonal, tasaInteresPersonal);
                    solicitudes.add(solicitudPersonal);
                    credito = new Credito(solicitudes, "pendiente");
                    JOptionPane.showMessageDialog(null, "Solicitud de crédito personal realizada.");
                    break;

                case 2:

                    String direccionPropiedad = JOptionPane.showInputDialog("Ingrese la dirección de la propiedad:");
                    int valorPropiedad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la propiedad:"));
                    Propiedad propiedad = new Propiedad(direccionPropiedad, valorPropiedad);

                    int montoHipotecario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto del crédito hipotecario:"));
                    String plazoHipotecario = JOptionPane.showInputDialog("Ingrese el plazo del crédito hipotecario:");
                    double tasaInteresHipotecario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tasa de interés del crédito hipotecario:"));

                    SolicitudCredito solicitudHipotecaria = new SolicitudCredito(cliente, "hipotecario", montoHipotecario, plazoHipotecario, tasaInteresHipotecario);
                    solicitudes.add(solicitudHipotecaria);
                    creditoHipotecario = new CreditoHipotecario(solicitudes, "pendiente", propiedad);
                    JOptionPane.showMessageDialog(null, "Solicitud de crédito hipotecario realizada.");
                    break;

                case 3:

                    if (credito != null) {
                        credito.aprobar();
                        JOptionPane.showMessageDialog(null, "Crédito personal aprobado.");
                    } else if (creditoHipotecario != null) {
                        creditoHipotecario.aprobar();
                        JOptionPane.showMessageDialog(null, "Crédito hipotecario aprobado.");
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay créditos pendientes para aprobar.");
                    }
                    break;

                case 4:

                    if (credito != null) {
                        credito.rechazar();
                        JOptionPane.showMessageDialog(null, "Crédito personal rechazado.");
                    } else if (creditoHipotecario != null) {
                        creditoHipotecario.rechazar();
                        JOptionPane.showMessageDialog(null, "Crédito hipotecario rechazado.");
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay créditos pendientes para rechazar.");
                    }
                    break;

                case 5:

                    if (credito != null) {
                        JOptionPane.showMessageDialog(null, "El estado del crédito personal es: " + credito.obtenerEstado());
                    } else if (creditoHipotecario != null) {
                        JOptionPane.showMessageDialog(null, "El estado del crédito hipotecario es: " + creditoHipotecario.obtenerEstado());
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay créditos registrados.");
                    }
                    break;

                case 6:

                    StringBuilder historial = new StringBuilder("Historial crediticio:\n");
                    for (SolicitudCredito solicitud : solicitudes) {
                        historial.append("Tipo: ").append(solicitud.obtenerTipoCredito())
                                .append(", Monto: ").append(solicitud.obtenerMonto())
                                .append(", Plazo: ").append(solicitud.obtenerPlazo())
                                .append(", Tasa de Interés: ").append(solicitud.obtenerTasaInteres())
                                .append("\n");
                    }
                    JOptionPane.showMessageDialog(null, historial.toString());
                    break;

                case 7:

                    JOptionPane.showMessageDialog(null, "Saliendo del sistema.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 7);
    }
}
