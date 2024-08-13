package Seguimiento3.Concierto;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

class Entrada {
    private int numeroEntrada;
    private String zona;
    private int valor;
    private boolean vendida;
    private boolean ingresada;

    public Entrada(int numeroEntrada, String zona, int valor) {
        this.numeroEntrada = numeroEntrada;
        this.zona = zona;
        this.valor = valor;
        this.vendida = false;
        this.ingresada = false;
    }

    public int getNumeroEntrada() {
        return numeroEntrada;
    }
    public String getZona() {
        return zona;
    }
    public int getValor() {
        return valor;
    }
    public boolean isVendida() {
        return vendida;
    }
    public boolean isIngresada() {
        return ingresada;
    }
    public void marcarVendida() {
        this.vendida = true;
    }
    public void marcarIngresada() {
        if (vendida) {
            this.ingresada = true;
            JOptionPane.showMessageDialog(null,"Entrada "+numeroEntrada+" ingresada con éxito.");
        } else {
            JOptionPane.showMessageDialog(null,"La entrada "+numeroEntrada+" no ha sido vendida aún.");
        }
    }
}
class Concierto {
    private int maxEntradasVIP;
    private int maxEntradasGeneral;
    private List<Entrada> entradasVendidas;

    public Concierto(int maxEntradasVIP, int maxEntradasGeneral) {
        this.maxEntradasVIP = maxEntradasVIP;
        this.maxEntradasGeneral = maxEntradasGeneral;
        this.entradasVendidas = new ArrayList<>();
    }
    public boolean verificarDisponibilidad(String zona) {
        long entradasVendidasEnZona = entradasVendidas.stream().filter(e -> e.getZona().equals(zona)).count();
        if (zona.equals("VIP")) {
            return entradasVendidasEnZona < maxEntradasVIP;
        } else if (zona.equals("GENERAL")) {
            return entradasVendidasEnZona < maxEntradasGeneral;
        }
        return false;
    }
    public void venderEntrada(String zona, int valor) {
        if (verificarDisponibilidad(zona)) {
            int numeroEntrada = entradasVendidas.size() + 1;
            Entrada nuevaEntrada = new Entrada(numeroEntrada, zona, valor);
            nuevaEntrada.marcarVendida();
            entradasVendidas.add(nuevaEntrada);
            JOptionPane.showMessageDialog(null,"Entrada "+numeroEntrada+" vendida en zona "+zona+" por $"+valor);
        } else {
            JOptionPane.showMessageDialog(null,"No hay disponibilidad en la zona "+zona);
        }
    }
    public void registrarIngreso(int numeroEntrada) {
        for (Entrada entrada : entradasVendidas) {
            if (entrada.getNumeroEntrada() == numeroEntrada) {
                entrada.marcarIngresada();
                return;
            }
        }
    JOptionPane.showMessageDialog(null,"La entrada "+numeroEntrada+" no existe o no ha sido vendida.");
    }
}
