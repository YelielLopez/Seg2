package Seguimiento3.Zapateria;

import javax.swing.*;

class Zapato {
    private String nombre;
    private String material;
    private String color;
    private int precio;
    private String coleccion;

    public Zapato(String nombre, String material, String color, int precio, String coleccion) {
        this.nombre = nombre;
        this.material = material;
        this.color = color;
        this.precio = precio;
        this.coleccion = coleccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public int getPrecio() {
        return precio;
    }

    public String getColeccion() {
        return coleccion;
    }
}

class Inventario {
    private Zapato modelo;
    private float talla;
    private int cantidades;

    public Inventario(Zapato modelo, float talla, int cantidades) {
        this.modelo = modelo;
        this.talla = talla;
        this.cantidades = cantidades;
    }

    public Zapato getModelo() {
        return modelo;
    }

    public float getTalla() {
        return talla;
    }

    public int getCantidades() {
        return cantidades;
    }

    public void registrarEntrada(int cantidad) {
        this.cantidades += cantidad;
    }

    public void registrarSalida(int cantidad) {
        if (cantidad <= this.cantidades) {
            this.cantidades -= cantidad;
        } else {
            JOptionPane.showMessageDialog(null,"No hay suficiente stock para la venta.");
        }
    }

    public void imprimirInventario() {
        JOptionPane.showMessageDialog(null,"Modelo: "+modelo.getNombre()+", Talla: "+talla+", Stock: "+cantidades);
    }
}

class Venta {
    private String fecha;
    private Zapato modelo;
    private float talla;
    private int cantidad;
    private int valor;

    public Venta(String fecha, Zapato modelo, float talla, int cantidad) {
        this.fecha = fecha;
        this.modelo = modelo;
        this.talla = talla;
        this.cantidad = cantidad;
        this.valor = modelo.getPrecio() * cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Zapato getModelo() {
        return modelo;
    }

    public float getTalla() {
        return talla;
    }

    public int calcularTotal() {
        return valor;
    }

    public void imprimirDetalle() {
        JOptionPane.showMessageDialog(null,"Fecha: "+fecha+", Modelo: "+modelo.getNombre()+", Talla: "+talla+", Cantidad: "+cantidad+", Valor Total: $"+calcularTotal());
    }
}