package Ejercicio1_Tienda_De_Mascotas;

public class MainMascota {

    public static void main(String[] args) {
        Mascota mascota1 = new Mascota("Rex", 3, "Pastor Alemán", "Negro y Marrón");
        Mascota mascota2 = new Mascota("Milo", 2, "Beagle", "Blanco y Marrón");
        Mascota mascota3 = new Mascota("Luna", 1, "Labrador", "Amarillo");

        mascota1.imprimirDetalles();
        mascota2.imprimirDetalles();
        mascota3.imprimirDetalles();

        mascota1.setNombre("Max");
        mascota1.setEdad(4);
        mascota1.setRaza("Labrador");
        mascota1.setColor("Negro");
        
        System.out.println("Después de modificar los atributos de la mascota1:");
        mascota1.imprimirDetalles();
    }
}


