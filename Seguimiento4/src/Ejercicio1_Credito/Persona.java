package Ejercicio1_Credito;

public class Persona {

    private String nombre;
    private String direccion;
    private int identificacion;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public Persona(String nombre, String direccion, int identificacion){
        this.nombre = nombre;
        this.direccion = direccion;
        this.identificacion = identificacion;

    }

    public String obtenerNombre(){
        return getNombre();
    }
    public String obtenerDireccion(){
        return getDireccion();
    }
    public int obtenerIdentificacion(){
        return getIdentificacion();
    }

}


