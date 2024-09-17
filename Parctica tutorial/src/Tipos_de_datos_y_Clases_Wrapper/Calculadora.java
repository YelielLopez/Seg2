package Tipos_de_datos_y_Clases_Wrapper;

/*Crea un programa que:
Solicite al usuario dos números (pueden ser enteros o decimales).
Permita que el usuario elija una operación: suma, resta, multiplicación o división.
Use tanto tipos primitivos como Clases Wrapper para realizar los cálculos.
Imprima el resultado en la consola.*/

import javax.swing.*;

public class Calculadora {
    public static void main(String[] args) {

        Double num1 = Double.valueOf((JOptionPane.showInputDialog("Ingrese el primer número para la operación")));
        Double num2 = Double.valueOf((JOptionPane.showInputDialog("Ingrese el segundo número para la operación")));

        char signo = JOptionPane.showInputDialog("Ingrese la operacion matematica que desea hacer : (+, -, *, /").charAt(0);
        double resultado;

        switch (signo) {
            case '+':
                resultado = num1 + num2;
                JOptionPane.showMessageDialog(null, "El resultado es " + resultado);
                break;

            case '-':
                resultado = num1 - num2;
                JOptionPane.showMessageDialog(null, "El resultado es " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                JOptionPane.showMessageDialog(null,"El resultado es " + resultado);
                break;

            case '/':
                resultado = num1 / num2;
                JOptionPane.showMessageDialog(null, "El resultado es " + resultado);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Signo invalido");
                break;
        }


    }

}
