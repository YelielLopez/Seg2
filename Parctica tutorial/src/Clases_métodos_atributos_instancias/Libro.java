package Clases_métodos_atributos_instancias;
/*
📝 Ejercicio Final: Creando una Clase Completa
🔨 Paso 4: Desafío Práctico
Es momento de aplicar lo aprendido. Crea una clase completa que modele un Libro. Sigue estos pasos:

Define los atributos: titulo, autor, numPaginas y editorial.
Añade un método mostrarDetalles que imprima toda la información del libro.
Crea una instancia de Libro en el método main y asigna valores a los atributos.
Llama al método mostrarDetalles para imprimir la información del libro.
 */
public class Libro {
    // Atributos
    public String titulo;
    public String autor;
    public int numPaginas;
    public String editorial;

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numPaginas=" + numPaginas +
                ", editorial='" + editorial + '\'' +
                '}';
    }

    // Método para mostrar detalles del libro
    public void mostrarDetalles() {
        System.out.println(toString());
    }
}


