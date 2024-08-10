package Ejercicio5_Hotel;

public class SistemaReservasHotel {
    public static void main(String[] args) {

        Habitacion[] habitaciones = new Habitacion[5];
        habitaciones[0] = new Habitacion(101, 100.0, true, "");
        habitaciones[1] = new Habitacion(102, 120.0, true, "");
        habitaciones[2] = new Habitacion(103, 150.0, false, "John Doe");
        habitaciones[3] = new Habitacion(104, 200.0, true, "");
        habitaciones[4] = new Habitacion(105, 180.0, false, "Jane Smith");


        System.out.println("Datos de las habitaciones antes de las modificaciones:");
        for (Habitacion habitacion : habitaciones) {
            System.out.println("Habitación " + habitacion.getNumeroHabitacion() +
                    ": Precio por noche = $" + habitacion.getPrecioPorNoche() +
                    ", Disponibilidad = " + habitacion.isDisponibilidad() +
                    ", Huéspedes alojados = " + habitacion.getHuespedesAlojados());
        }


        habitaciones[1].setPrecioPorNoche(130.0);
        habitaciones[1].setDisponibilidad(false);
        habitaciones[1].setHuespedesAlojados("Alice Brown");


        System.out.println("\nDatos de las habitaciones después de las modificaciones:");
        for (Habitacion habitacion : habitaciones) {
            System.out.println("Habitación " + habitacion.getNumeroHabitacion() +
                    ": Precio por noche = $" + habitacion.getPrecioPorNoche() +
                    ", Disponibilidad = " + habitacion.isDisponibilidad() +
                    ", Huéspedes alojados = " + habitacion.getHuespedesAlojados());
        }
    }
}

