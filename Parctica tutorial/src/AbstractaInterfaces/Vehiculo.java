package AbstractaInterfaces;
/*🎯 Tarea 1: Creación de una Clase Abstracta
Crea una clase abstracta llamada Vehiculo con un método abstracto moverse() y un método concreto parar().
Crea una subclase llamada Coche que implemente el método moverse() para que imprima "El coche está en
 movimiento".
En el método main, crea una instancia de Coche y llama a los métodos moverse() y parar().*/
// Clase abstracta Vehiculo
public abstract class Vehiculo {
    public abstract void moverse();  // Método abstracto

    public void parar() {
        System.out.println("El vehículo se ha detenido.");
    }
}

