package ArrayList;
/*🎯 Tarea 1: Crear un ArrayList de Cadenas
Crea un ArrayList llamado colores para almacenar cadenas de texto.
Agrega tres colores de tu elección al ArrayList.
Muestra los colores en la consola.*/
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creación del ArrayList
        ArrayList<String> colores = new ArrayList<>();

        // Agregando colores
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");

        // Mostrando el ArrayList
        System.out.println("Colores: " + colores);
    }
}
