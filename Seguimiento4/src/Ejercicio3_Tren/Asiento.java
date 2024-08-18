package Ejercicio3_Tren;

public class Asiento {
    private int numero;
    private String estado;

    public Asiento(int numero) {
        this.numero = numero;
        this.estado = "disponible";
    }

    public int obtenerNumero() {
        return numero;
    }

    public String obtenerEstado() {
        return estado;
    }

    public void reservar() {
        this.estado = "reservado";
    }

    public void ocupar() {
        this.estado = "ocupado";
    }
}
