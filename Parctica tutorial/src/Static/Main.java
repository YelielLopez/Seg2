package Static;

public class Main {
    public static void main(String[] args) {
        Tienda tienda1 = new Tienda();
        Tienda tienda2 = new Tienda();

        tienda1.vender();
        tienda2.vender();
        tienda2.vender();

        tienda1.mostrarVentas();  // Muestra 3
        tienda2.mostrarVentas();  // También muestra 3
    }
}
