package Ejercicio5_Vuelos;

import java.util.List;

public class Avion {
    private String modelo;
    private int capacidad;
    private List<Asiento> listaAsientos;

    public Avion(String modelo, int capacidad, List<Asiento> listaAsientos) {
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.listaAsientos = listaAsientos;
    }

    public String obtenerModelo() {
        return modelo;
    }

    public int obtenerCapacidad() {
        return capacidad;
    }

    public Asiento obtenerAsiento(int numero) {
        for (Asiento asiento : listaAsientos) {
            if (asiento.obtenerNumero() == numero) {
                return asiento;
            }
        }
        return null; // Si no se encuentra el asiento
    }
}
