package Tipos_de_datos_y_Clases_Wrapper;

/* 🎯 Tarea 1: Declarando Tipos Primitivos
Escribe tu propio código donde declares una variable de cada tipo primitivo y muéstrala por consola.
Asegúrate de entender para qué se utiliza cada uno. */

public class TiposDatos {
    public static void main(String[] args) {
        // Numeros de pequeño a mas grade
        byte pequeño = 112;
        short pequeñoMasGrande = 2331;
        int medianamenteGrande = 12321;
        long superGrande = 1231231231;

        // Punto Flotantes 32 bits a 64 bits

        float decimal32 = 3.14F;
        double decimal64 = 3.141516;

        //otros

        char caracter = 'A';//16 bits, almacena un carácter Unicode (Se usa "").
        boolean verdaderoFalso= true;

        System.out.println(pequeño);
        System.out.println(pequeñoMasGrande);
        System.out.println(medianamenteGrande);
        System.out.println(superGrande);
        System.out.println(decimal32);
        System.out.println(decimal64);
        System.out.println(caracter);
        System.out.println(verdaderoFalso);

    }
}
