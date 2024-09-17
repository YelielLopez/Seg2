package ArrayList;
/*🎯 Tarea 3: Eliminar y Recorrer un ArrayList
Crea un ArrayList llamado frutas y agrega tres frutas (ej. "Manzana", "Pera", "Naranja").
Elimina la fruta en la posición 0.
Recorre el ArrayList con un bucle for-each y muestra las frutas restantes.*/
import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();

        // Agregando frutas
        frutas.add("Manzana");
        frutas.add("Pera");
        frutas.add("Naranja");

        // Eliminando la fruta en la posición 0
        frutas.remove(0);  // Elimina "Manzana"

        // Recorriendo el ArrayList
        for (String fruta : frutas) {
            System.out.println("Fruta: " + fruta);
        }
    }
}
