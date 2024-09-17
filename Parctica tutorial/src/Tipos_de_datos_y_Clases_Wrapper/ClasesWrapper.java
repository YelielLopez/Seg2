package Tipos_de_datos_y_Clases_Wrapper;

/* 🎯 Tarea 2: Usando Clases Wrapper
1. Declara una variable utilizando una Clase Wrapper (por ejemplo, Integer, Double, o Boolean).
2. Usa algunos de los métodos de la Clase Wrapper como intValue(), doubleValue(), o toString().
3. Imprime los resultados en la consola. */

public class ClasesWrapper {
    public static void main(String[] args) {

        Integer entero = 500;
        Double decimal = 4.18;
        Boolean verdaderoFalso = false;

        String num = entero.toString();
        int newdecimal = decimal.intValue();
       String falso = verdaderoFalso.toString();

        System.out.println(num);
        System.out.println(newdecimal);
        System.out.println(falso);

    }
}
