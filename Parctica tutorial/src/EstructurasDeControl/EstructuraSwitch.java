package EstructurasDeControl;

import javax.swing.*;
/*🎯 Tarea 2: Usando switch
Crea un programa que tome como entrada el número de un mes (del 1 al 12) y use una
estructura switch para imprimir el nombre del mes. Asegúrate de
 manejar el caso donde el número no esté entre 1 y 12.
 */
public class EstructuraSwitch {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del mes"));

        switch (num) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Doviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("Numero no valido");
                break;
        }
    }

    /*❓ Pregunta de selección múltiple
¿Qué imprimirá el siguiente código si dia es 7?

int dia = 7;
switch (dia) {
    case 1:
        System.out.println("Lunes");
        break;
    case 2:
        System.out.println("Martes");
        break;
    case 3:
        System.out.println("Miércoles");
        break;
    default:
        System.out.println("Fin de semana");
        break;
}
A) Lunes
B) Fin de semana ✔
C) Miércoles
D) Error en el código
}
*/
}