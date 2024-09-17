package EstructurasDeControl;

import javax.swing.*;
/*🎯 Tarea 1: Escribiendo tus propios if-else
Declara una variable entera llamada edad.
Escribe un programa que imprima:
"Eres menor de edad" si edad es menor que 18.
"Eres mayor de edad" si edad es 18 o más.*/
public class EstructuraIF {
    public static void main(String[] args) {

        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));

        if (edad < 18) {
            System.out.println("Eres menor de edad");
        }else
            System.out.println("Eres mayor de edad");


    }

    /*❓ Pregunta de selección múltiple
¿Cuál es el valor de salida para el siguiente código si edad es 17?

    int edad = 17;
if (edad >= 18) {
        System.out.println("Mayor de edad");
    } else {
        System.out.println("Menor de edad");
    }
    A) Mayor de edad✔
    B) Menor de edad
    C) Error en el código
    D) Ninguna de las anteriores*/
}
