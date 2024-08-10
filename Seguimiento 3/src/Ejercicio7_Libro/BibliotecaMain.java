package Ejercicio7_Libro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BibliotecaMain {
    private static List<Libro> libros = new ArrayList<>();
    private static List<Usuario> usuarios = new ArrayList<>();
    private static List<Prestamo> prestamos = new ArrayList<>();

    public static void main(String[] args) {

        Libro libro1 = new Libro("1234567890", "El Quijote", "Miguel de Cervantes", 1605, "Editorial A", 500, "Novela");
        Libro libro2 = new Libro("0987654321", "Cien Años de Soledad", "Gabriel García Márquez", 1967, "Editorial B", 400, "Realismo Mágico");
        libros.add(libro1);
        libros.add(libro2);


        Usuario usuario1 = new Usuario("Juan Pérez", "001", "555-1234");
        Usuario usuario2 = new Usuario("María López", "002", "555-5678");
        usuarios.add(usuario1);
        usuarios.add(usuario2);


        Date fechaPrestamo = new Date();
        Prestamo prestamo1 = new Prestamo(libro1.getIsbn(), usuario1.getIdentificacion(), fechaPrestamo, null);
        prestamos.add(prestamo1);


        System.out.println("Libros registrados:");
        for (Libro libro : libros) {
            System.out.println("ISBN: " + libro.getIsbn());
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Año de Publicación: " + libro.getAnioPublicacion());
            System.out.println("Editorial: " + libro.getEditorial());
            System.out.println("Número de Páginas: " + libro.getNumeroPaginas());
            System.out.println("Categorías: " + libro.getCategorias());
            System.out.println();
        }


        System.out.println("Usuarios registrados:");
        for (Usuario usuario : usuarios) {
            System.out.println("Nombre: " + usuario.getNombre());
            System.out.println("Identificación: " + usuario.getIdentificacion());
            System.out.println("Teléfono: " + usuario.getTelefono());
            System.out.println();
        }


        System.out.println("Préstamos realizados:");
        for (Prestamo prestamo : prestamos) {
            System.out.println("ISBN Libro: " + prestamo.getIsbnLibro());
            System.out.println("Identificación Usuario: " + prestamo.getIdentificacionUsuario());
            System.out.println("Fecha Préstamo: " + prestamo.getFechaPrestamo());
            System.out.println("Fecha Devolución: " + prestamo.getFechaDevolucion());
            System.out.println();
        }
    }
}