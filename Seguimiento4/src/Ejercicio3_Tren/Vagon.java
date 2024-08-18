package Ejercicio3_Tren;

import java.util.List;

public class Vagon {
    private String tipo;
    private int capacidad;
    private List<Asiento> listaAsientos;

    public Vagon(String tipo, int capacidad, List<Asiento> listaAsientos) {
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.listaAsientos = listaAsientos;
    }

    public String obtenerTipo() {
        return tipo;
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
        return null;
    }
}
