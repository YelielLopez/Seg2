package AbstractaInterfaces;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.moverse();  // Llama al método implementado
        coche.parar();    // Llama al método concreto de la clase abstracta
        
        coche.moverse();  // Llama al método de Vehiculo
        coche.conducir();  // Llama al método de Conductor

    }
}



