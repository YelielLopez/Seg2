package Ejercicio1_Credito;
import java.util.ArrayList;
import java.util.List;

public class Credito {
    private List<SolicitudCredito> solicitudCreditoList;
    private String estado;

    public Credito(List<SolicitudCredito> solicitudCreditoList, String estado) {
        this.solicitudCreditoList = solicitudCreditoList;
        this.estado = estado;
    }

    public List<SolicitudCredito> getSolicitudCreditoList() {
        return solicitudCreditoList;
    }

    public void setSolicitudCreditoList(List<SolicitudCredito> solicitudCreditoList) {
        this.solicitudCreditoList = solicitudCreditoList;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List obtenerSolicitudCredito(){
        return  getSolicitudCreditoList();
    }
    public String obtenerEstado(){
        return getEstado();
    }

    public void aprobar() {
        this.estado = "aprobado";
    }

    public void rechazar() {
        this.estado = "rechazado";
    }


}
