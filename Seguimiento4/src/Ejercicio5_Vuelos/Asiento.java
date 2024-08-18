package Ejercicio5_Vuelos;

public class Asiento {
    private int numero;
    private String clase;
    private String estado; // "disponible", "reservado", "ocupado"

    public Asiento(int numero, String clase) {
        this.numero = numero;
        this.clase = clase;
        this.estado = "disponible";
    }

    public int obtenerNumero() {
        return numero;
    }

    public String obtenerClase() {
        return clase;
    }

    public String obtenerEstado() {
        return estado;
    }

    public void reservar() {
        if (estado.equals("disponible")) {
            estado = "reservado";
        }
    }

    public void ocupar() {
        if (estado.equals("reservado")) {
            estado = "ocupado";
        }
    }
}
