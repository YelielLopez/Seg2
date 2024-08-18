package Ejercicio3_Tren;

import java.util.List;

public class Tren {
    private String numero;
    private String ruta;
    private List<Vagon> listaVagones;

    public Tren(String numero, String ruta, List<Vagon> listaVagones) {
        this.numero = numero;
        this.ruta = ruta;
        this.listaVagones = listaVagones;
    }

    public String obtenerNumero() {
        return numero;
    }

    public String obtenerRuta() {
        return ruta;
    }

    public Vagon obtenerVagon(String tipo) {
        for (Vagon vagon : listaVagones) {
            if (vagon.obtenerTipo().equals(tipo)) {
                return vagon;
            }
        }
        return null;
    }
}
