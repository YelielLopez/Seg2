package Ejercicio5_Vuelos;

public class Persona {
    private String nombre;
    private int identificacion;
    private String contacto;

    public Persona(String nombre, int identificacion, String contacto) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.contacto = contacto;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerIdentificacion() {
        return identificacion;
    }

    public String obtenerContacto() {
        return contacto;
    }
}
