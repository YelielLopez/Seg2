package FuncionesCadena;
/*🎯 Tarea 4: Buscar y reemplazar en una cadena
Crea una cadena llamada oracion con el texto "Aprender Java es fácil".
Verifica si la palabra "fácil" está presente en la oración.
Reemplaza la palabra "fácil" por "interesante" y muestra la nueva oración.*/
public class Main4 {
    public static void main(String[] args) {
        String oracion = "Aprender Java es fácil";

        // Verificar si la cadena contiene "fácil"
        boolean contiene = oracion.contains("fácil");
        System.out.println("¿Contiene 'fácil'? " + contiene);  // true

        // Reemplazar "fácil" por "interesante"
        String nuevaOracion = oracion.replace("fácil", "interesante");
        System.out.println("Oración modificada: " + nuevaOracion);
    }
}
/*❓ Preguntas de Selección Múltiple
¿Qué hace el método length() en una cadena?

A) Devuelve el último carácter de la cadena.
B) Convierte la cadena a minúsculas.
C) Devuelve el número de caracteres en la cadena.
D) Elimina espacios en blanco.
Respuesta: C

¿Qué método se utiliza para convertir una cadena a minúsculas?

A) toLowerCase()
B) toUpperCase()
C) trim()
D) substring()
Respuesta: A

¿Qué método permite buscar una subcadena dentro de otra cadena?

A) replace()
B) substring()
C) contains()
D) length()
Respuesta: C

¿Qué método se utiliza para reemplazar una subcadena en una cadena?

A) replace()
B) substring()
C) contains()
D) toUpperCase()
Respuesta: A
*/