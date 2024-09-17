package Clases_métodos_atributos_instancias;

public class MainLibro {
    public static void main(String[] args) {
        // Crear una instancia de la clase Libro y asignar valores
        Libro libro = new Libro();

        libro.autor = "Gabriel García Márquez";
        libro.editorial = "Editorial Sudamericana";
        libro.numPaginas = 137;
        libro.titulo = "Cien años de soledad";
        libro.mostrarDetalles();
        // Llamar al método para mostrar detalles

    }
}
