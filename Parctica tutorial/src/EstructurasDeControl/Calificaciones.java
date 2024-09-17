package EstructurasDeControl;
/*📝 Ejercicio Final: Aplicación de Estructuras de Control
🔨 Paso 6: Desafío Práctico
Imagina que estás creando una aplicación para un sistema de calificaciones. Debes escribir un programa que:

Solicite al usuario una nota numérica entre 0 y 100.
Use un if-else para asignar una letra de calificación:
A (90-100), B (80-89), C (70-79), D (60-69), F (menos de 60).
Luego, imprime la letra correspondiente usando switch.*/
import java.util.Scanner;

import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su calificación (0-100): ");
        int nota = scanner.nextInt();

        char letraCalificacion;

        if (nota >= 90) {
            letraCalificacion = 'A';
        } else if (nota >= 80) {
            letraCalificacion = 'B';
        } else if (nota >= 70) {
            letraCalificacion = 'C';
        } else if (nota >= 60) {
            letraCalificacion = 'D';
        } else {
            letraCalificacion = 'F';
        }

        switch (letraCalificacion) {
            case 'A':
                System.out.println("Excelente trabajo");
                break;
            case 'B':
                System.out.println("Buen trabajo");
                break;
            case 'C':
                System.out.println("Trabajo aceptable");
                break;
            case 'D':
                System.out.println("Apenas pasaste");
                break;
            case 'F':
                System.out.println("Reprobado");
                break;
        }
    }
}
