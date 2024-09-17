package HerenciaPolimorfismo;


public class Main {
    public static void main(String[] args) {
        // Polimorfismo: Usar referencia de tipo Vehiculo para instanciar un Coche
        Vehiculo miVehiculo1 = new Coche();
        miVehiculo1.marca = "Toyota";
        miVehiculo1.arrancar();  // Llamará al método arrancar() de Coche

        // Polimorfismo: Usar referencia de tipo Vehiculo para instanciar una Moto
        Vehiculo miVehiculo2 = new Moto();
        miVehiculo2.marca = "Honda";
        miVehiculo2.arrancar();  // Llamará al método arrancar() de Moto
    }
}