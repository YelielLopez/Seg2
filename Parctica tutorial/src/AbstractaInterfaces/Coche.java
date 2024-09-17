package AbstractaInterfaces;

// Clase Coche que implementa Conductor y extiende Vehiculo
public class Coche extends Vehiculo implements Conductor {
    @Override
    public void moverse() {
        System.out.println("El coche está en movimiento.");
    }

    @Override
    public void conducir() {
        System.out.println("El coche está siendo conducido.");
    }
}
