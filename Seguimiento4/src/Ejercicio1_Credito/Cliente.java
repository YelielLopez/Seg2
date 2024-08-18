package Ejercicio1_Credito;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {

    private List<SolicitudCredito> solicitudesCreditos;
    private String historialCrediticio;
    private int ingresos;


    public Cliente(String nombre, String direccion, int identificacion, List<SolicitudCredito> solicitudesCreditos, String historialCrediticio, int ingresos) {
        super(nombre, direccion, identificacion);
        this.solicitudesCreditos = solicitudesCreditos;
        this.historialCrediticio = historialCrediticio;
        this.ingresos = ingresos;
    }

    public List<SolicitudCredito> getSolicitudesCreditos() {
        return solicitudesCreditos;
    }

    public void setSolicitudesCreditos(List<SolicitudCredito> solicitudesCreditos) {
        this.solicitudesCreditos = solicitudesCreditos;
    }

    public String getHistorialCrediticio() {
        return historialCrediticio;
    }

    public void setHistorialCrediticio(String historialCrediticio) {
        this.historialCrediticio = historialCrediticio;
    }

    public int getIngresos() {
        return ingresos;
    }

    public void setIngresos(int ingresos) {
        this.ingresos = ingresos;
    }

    public String ObtenerHistorialcrediticio(){
        return getHistorialCrediticio();
    }

    public int ObtenerIngresos(){
        return getIngresos();
    }
}
