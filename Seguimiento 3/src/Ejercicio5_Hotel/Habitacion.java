package Ejercicio5_Hotel;

public class Habitacion {
    private int numeroHabitacion;
    private double precioPorNoche;
    private boolean disponibilidad;
    private String huespedesAlojados;


    public Habitacion(int numeroHabitacion, double precioPorNoche, boolean disponibilidad, String huespedesAlojados) {
        this.numeroHabitacion = numeroHabitacion;
        this.precioPorNoche = precioPorNoche;
        this.disponibilidad = disponibilidad;
        this.huespedesAlojados = huespedesAlojados;
    }


    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public String getHuespedesAlojados() {
        return huespedesAlojados;
    }


    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public void setHuespedesAlojados(String huespedesAlojados) {
        this.huespedesAlojados = huespedesAlojados;
    }
}