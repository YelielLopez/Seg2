package HerenciaPolimorfismo;
/*🎯 Tarea 1: Creación de clases con herencia
Crea una clase llamada Vehiculo con un atributo marca y un método arrancar().
Crea una subclase llamada Coche que herede de Vehiculo y sobrescriba el método arrancar() para que imprima "El coche arranca".
En el método main, crea una instancia de Coche, asigna un valor a marca y llama al método arrancar().
*/

/*🎯 Tarea 2: Aplicando el polimorfismo
En tu clase Vehiculo (creada en la Tarea 1), agrega una subclase llamada Moto que sobrescriba el
método arrancar() para imprimir "La moto arranca".
En el método main, usa una referencia de la clase base (Vehiculo) para instanciar tanto un Coche
como una Moto. Llama al método arrancar() en ambos casos y observa cómo cambia la salida.*/
// Clase base Vehiculo
// Clase base Vehiculo
class Vehiculo {
    // Atributo
    String marca;

    // Método arrancar de la clase Vehiculo
    public void arrancar() {
        System.out.println("El vehículo arranca");
    }
}

// Subclase Coche que hereda de Vehiculo
class Coche extends Vehiculo {

    // Sobrescritura del método arrancar
    @Override
    public void arrancar() {
        System.out.println("El coche arranca");
    }
}

// Subclase Moto que hereda de Vehiculo
class Moto extends Vehiculo {

    // Sobrescritura del método arrancar
    @Override
    public void arrancar() {
        System.out.println("La moto arranca");
    }
}


