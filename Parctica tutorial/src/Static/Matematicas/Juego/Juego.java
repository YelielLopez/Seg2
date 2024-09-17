package Static.Matematicas.Juego;
/*🎯 Tarea 3: Usar Métodos y Variables static Juntos
Crea una clase llamada Juego con una variable static llamada jugadoresConectados y un método static llamado conectarJugador(), que incremente el número de jugadores conectados.
Crea otro método static llamado mostrarJugadoresConectados() que imprima el número de jugadores conectados.
En el método main, conecta tres jugadores y muestra el número total de jugadores conectados.*/
public class Juego {
    static int jugadoresConectados = 0;

    public static void conectarJugador() {
        jugadoresConectados++;
    }

    public static void mostrarJugadoresConectados() {
        System.out.println("Jugadores conectados: " + jugadoresConectados);
    }
}

