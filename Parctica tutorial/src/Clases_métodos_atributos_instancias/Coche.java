package Clases_métodos_atributos_instancias;
/*🎯 Tarea 1: Define tu propia clase
Crea una clase llamada Coche que tenga los siguientes atributos: marca, modelo, año y color.
Declara los atributos sin asignarles valores aún.*/

public class Coche {
    //Atrubutos
    String modelo;
    String marca;
    int año;
    String color;

    /*🎯 Tarea 2: Añade métodos
A tu clase Coche, añade un método llamado mostrarCoche que imprima los valores de los atributos
marca, modelo, año y color.*/


    // Método
public void MostrarCoche(){
    System.out.println("Marca: "+ marca);
    System.out.println("Modelo: "+ modelo);
    System.out.println("Año: "+ año);
    System.out.println("Color: "+ color);

}
/*🎯 Tarea 3: Crear una instancia y usar métodos
En el programa principal, crea una instancia de tu clase Coche.
Asigna valores a los atributos como marca = "Toyota", modelo = "Corolla", etc.
Llama al método mostrarCoche para mostrar la información del coche.*/
    public static void main(String[] args) {
        Coche coche = new Coche();

        coche.marca = "Toyota";
        coche.modelo = "Corolla";
        coche.año = 2000;
        coche.color = "Gris";

        coche.MostrarCoche();
    }
}

/*❓ Preguntas de Selección Múltiple
¿Qué es una instancia en Java?

A) Un método de una clase
B) Un atributo de una clase
C) Un objeto creado a partir de una clase ✔
D) Una función externa
¿Qué hace un método en Java?

A) Define características de una clase
B) Realiza acciones que pueden ser ejecutadas por los objetos ✔
C) Declara variables
D) No tiene función específica
¿Cómo accedes a los atributos de una instancia?

A) Con el operador +
B) Usando la palabra clave return
C) A través del nombre del objeto seguido de . y el nombre del atributo ✔
D) No es posible acceder a atributos desde fuera de una clase
*/
