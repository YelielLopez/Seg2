package Seguimiento3.Inmobiliaria;

import javax.swing.*;

public class Inmoviliaria {

    public static class Propiedades {

        private byte habitaciones;
        private byte banios;
        private int id;
        private int area;
        private int precio;
        private String direccion;
        private String garaje;
        private String estado ;

        public Propiedades(byte habitaciones, byte banios, int id, int area, int precio, String direccion, String garaje, String estado) {
            this.habitaciones = habitaciones;
            this.banios = banios;
            this.id = id;
            this.area = area;
            this.precio = precio;
            this.direccion = direccion;
            this.garaje = garaje;
            this.estado = estado;
        }

        public byte getHabitaciones() {
            return habitaciones;
        }

        public void setHabitaciones(byte habitaciones) {
            this.habitaciones = habitaciones;
        }

        public byte getBanios() {
            return banios;
        }

        public void setBanios(byte banios) {
            this.banios = banios;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getArea() {
            return area;
        }

        public void setArea(int area) {
            this.area = area;
        }

        public int getPrecio() {
            return precio;
        }

        public void setPrecio(int precio) {
            this.precio = precio;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public String getGaraje() {
            return garaje;
        }

        public void setGaraje(String garaje) {
            this.garaje = garaje;
        }

        public String isEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }
        public void mostrar(){
            JOptionPane.showMessageDialog(null,"La Propiedadd Dispone de: "+habitaciones+" Habitaciones, "+banios+" Baños,"+" Garaje "+garaje+", Dispone de una Area Cuadrada de "+area+", Ubicada en "+direccion+", con un Precio de "+precio+", Identificada con "+id+" Se encuentra "+estado);
        }

    }

    public static void main(String[] args) {//  Investigar por que " byte " debe ir entre parentesis, a diferencia del int.
        Propiedades P1 = new Propiedades((byte) 6, (byte) 3, 15975356, 150, 850000, "Barrio el Padrio Casa 3 carrera 6-9", "Si", "Vendida");
        Propiedades P2 = new Propiedades((byte) 4, (byte) 2, 15975357, 120, 650000, "Calle 10 No 15-20, Apt 2", "Si", "Vendida");
        Propiedades P3 = new Propiedades((byte) 3, (byte) 1, 15975358, 90, 500000, "Avenida Siempre Viva, Apartaestudio 742", "No", "Rentada");

        Propiedades[] propiedades = {P1, P2, P3};

        for (Propiedades propiedad : propiedades) {
            propiedad.mostrar();
        }

        P1.setEstado("Vendida");
        P1.mostrar();
    }
}
