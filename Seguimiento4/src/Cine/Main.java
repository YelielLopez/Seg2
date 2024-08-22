package Cine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static Cine cine;
    private static Cine.Sala sala1;
    private static Cine.Funcion funcion1;
    private static Cine.Cliente cliente1;

    public static void main(String[] args) {
        cine = new Cine();
        sala1 = cine.new Sala(1, 5, 5); // Sala más pequeña
        funcion1 = cine.new Funcion("Avatar", 20.30f, sala1, 20.00f);
        cliente1 = cine.new Cliente("Juan Pérez", "Calle 123", 1);

        JFrame frame = new JFrame("Sistema de Cine");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        JPanel panelSala = new JPanel();
        panelSala.setLayout(new GridLayout(sala1.obtenerSala().length, sala1.obtenerSala()[0].length));

        for (int i = 0; i < sala1.obtenerSala().length; i++) {
            for (int j = 0; j < sala1.obtenerSala()[0].length; j++) {
                Cine.Asiento asiento = sala1.obtenerAsiento(i, j);
                JButton btnAsiento = new JButton("F" + i + "C" + j);
                btnAsiento.setActionCommand(i + "," + j);
                btnAsiento.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String[] coords = e.getActionCommand().split(",");
                        int fila = Integer.parseInt(coords[0]);
                        int columna = Integer.parseInt(coords[1]);
                        Cine.Asiento asientoSeleccionado = sala1.obtenerAsiento(fila, columna);
                        if (asientoSeleccionado != null) {
                            if (asientoSeleccionado.obtenerEstado().equals("disponible")) {
                                int respuesta = JOptionPane.showConfirmDialog(frame, "¿Desea reservar este asiento?", "Confirmar Reserva", JOptionPane.YES_NO_OPTION);
                                if (respuesta == JOptionPane.YES_OPTION) {
                                    asientoSeleccionado.reservar();
                                    JOptionPane.showMessageDialog(frame, "Asiento reservado con éxito.");
                                    btnAsiento.setText("Reservado");
                                    btnAsiento.setEnabled(false);
                                }
                            } else if (asientoSeleccionado.obtenerEstado().equals("reservado")) {
                                JOptionPane.showMessageDialog(frame, "El asiento ya está reservado.");
                            } else {
                                JOptionPane.showMessageDialog(frame, "El asiento ya está ocupado.");
                            }
                        }
                    }
                });
                panelSala.add(btnAsiento);
            }
        }

        JPanel panelControl = new JPanel();
        panelControl.setLayout(new GridLayout(1, 3));

        JButton btnVerDisponibilidad = new JButton("Ver Disponibilidad");
        btnVerDisponibilidad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String disponibilidad = sala1.verDisponibilidad();
                JOptionPane.showMessageDialog(frame, disponibilidad);
            }
        });
        panelControl.add(btnVerDisponibilidad);

        JButton btnHistorialReservas = new JButton("Ver Historial");
        btnHistorialReservas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verHistorialReservas(cliente1);
            }
        });
        panelControl.add(btnHistorialReservas);

        JButton btnSalir = new JButton("Salir");
        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        panelControl.add(btnSalir);

        frame.add(panelSala, BorderLayout.CENTER);
        frame.add(panelControl, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    private static void verHistorialReservas(Cine.Cliente cliente) {
        List<Cine.Reserva> historial = cliente.obtenerHistorialReservas();
        StringBuilder sb = new StringBuilder();
        sb.append("Historial de Reservas:\n");
        for (Cine.Reserva reserva : historial) {
            sb.append("Función: ").append(reserva.obtenerFuncion().obtenerPelicula()).append("\n");
            sb.append("Asientos reservados:\n");
            for (Cine.Asiento asiento : reserva.obtenerListaAsientos()) {
                sb.append("Fila ").append(asiento.obtenerFila()).append(", Columna ").append(asiento.obtenerColumna()).append("\n");
            }
            sb.append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}