package Ejercicio3_Tren;

public class Persona {
    private String nombre;
    private int identificacion;
    private String direccion;

    public Persona(String nombre, int identificacion, String direccion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.direccion = direccion;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerIdentificacion() {
        return identificacion;
    }

    public String obtenerDireccion() {
        return direccion;
    }
}
