package Ejercicio3_Tren;

public class Viaje {
    private String fecha;
    private String horaSalida;
    private String horaLlegada;
    private Tren tren;

    public Viaje(String fecha, String horaSalida, String horaLlegada, Tren tren) {
        this.fecha = fecha;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.tren = tren;
    }

    public String obtenerFecha() {
        return fecha;
    }

    public String obtenerHoraSalida() {
        return horaSalida;
    }

    public String obtenerHoraLlegada() {
        return horaLlegada;
    }

    public Tren obtenerTren() {
        return tren;
    }
}
