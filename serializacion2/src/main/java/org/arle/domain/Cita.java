package org.arle.domain;

public class Cita {
    private String nombreCita;
    private String fecha;
    private  int hora;
    private String motivo;
    private Paciente paciente;


    public Cita() {
    }

    public Cita(String nombreCita, String fecha, int hora, String motivo, Paciente paciente) {
        this.nombreCita = nombreCita;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.paciente = paciente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getNombreCita() {
        return nombreCita;
    }

    public void setNombreCita(String nombreCita) {
        this.nombreCita = nombreCita;
    }

    @Override
    public String toString() {
        return "Cita{" +
                "Nombre de la Cita='" + nombreCita + '\'' +
                ", fecha='" + fecha + '\'' +
                ", hora=" + hora +
                ", motivo='" + motivo + '\'' +
                ", paciente=" + paciente +
                '}';
    }
}
