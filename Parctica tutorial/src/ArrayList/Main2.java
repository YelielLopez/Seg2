package ArrayList;

/*🎯 Tarea 2: Modificar y Acceder a Elementos
Crea un ArrayList llamado numeros y agrega los números 10, 20, y 30.
Accede y muestra el segundo número (índice 1).
Modifica el número en la posición 2 (índice 2) a 50 y muestra el ArrayList actualizado.*/

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        // Agregando números
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        // Accediendo al segundo número
        System.out.println("Segundo número: " + numeros.get(1));  // 20

        // Modificando el número en la posición 2
        numeros.set(2, 50);  // Cambia 30 por 50
        System.out.println("Números actualizados: " + numeros);
    }
}
