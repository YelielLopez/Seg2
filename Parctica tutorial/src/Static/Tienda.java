package Static;
/*🎯 Tarea 1: Usar una variable static
Crea una clase llamada Tienda con una variable static llamada totalVentas.
Crea un método que incremente totalVentas cada vez que se realiza una venta.
En el método main, crea dos instancias de Tienda, realiza algunas ventas y muestra el valor de totalVentas.*/
public class Tienda {
    static int totalVentas = 0;

    public void vender() {
        totalVentas++;
    }

    public void mostrarVentas() {
        System.out.println("Total de ventas: " + totalVentas);
    }
}

