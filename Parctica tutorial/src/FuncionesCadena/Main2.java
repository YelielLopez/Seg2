package FuncionesCadena;
/*🎯 Tarea 2: Extraer una parte de la cadena
Crea una cadena llamada frase que contenga "Programar es divertido".
Usa el método substring() para extraer la palabra "divertido" y mostrarla en la consola.*/
public class Main2 {
    public static void main(String[] args) {
        String frase = "Programar es divertido";
        String palabra = frase.substring(13);  // Extrae "divertido"
        System.out.println("Palabra extraída: " + palabra);
    }
}
