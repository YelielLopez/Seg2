package Ejercicio1_Credito;


import java.util.List;

public class CreditoHipotecario extends Credito {

    private Propiedad propiedad;

    public CreditoHipotecario(List<SolicitudCredito> solicitudCreditoList, String estado, Propiedad propiedad) {
        super(solicitudCreditoList, estado);
        this.propiedad = propiedad;
    }

    public Propiedad getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(Propiedad propiedad) {
        this.propiedad = propiedad;
    }

    public Propiedad obtenerPropiedad(){
        return getPropiedad();
    }
}
