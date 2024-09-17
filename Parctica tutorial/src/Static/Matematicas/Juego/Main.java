package Static.Matematicas.Juego;

public class Main {
    public static void main(String[] args) {
        Juego.conectarJugador();
        Juego.conectarJugador();
        Juego.conectarJugador();

        Juego.mostrarJugadoresConectados();  // Muestra 3
    }
}
/*❓ Preguntas de Selección Múltiple
¿Qué permite una variable static en Java?

A) Cada instancia tiene su propia copia de la variable.
B) La variable static se comparte entre todas las instancias de la clase.
C) La variable static no puede ser modificada.
D) Solo puede ser usada en métodos no static.
Respuesta: B

¿Cómo se llama a un método static?

A) A través de una instancia de la clase.
B) Solo desde otros métodos no estáticos.
C) A través del nombre de la clase sin crear una instancia.
D) No se puede llamar a métodos static en Java.
Respuesta: C

¿Qué ocurre si una clase tiene una variable static y dos instancias de la clase la modifican?

A) Cada instancia tiene su propio valor de la variable.
B) La variable se actualiza solo para la instancia que la modificó.
C) Ambas instancias comparten la misma variable, por lo que el cambio se refleja en ambas.
D) No es posible modificar variables static.
Respuesta: C

¿Qué restricción tiene un método static?

A) No puede acceder a métodos o variables que no sean static.
B) No puede devolver valores.
C) No puede acceder a otras clases.
D) No puede llamarse sin una instancia de la clase.
Respuesta: A*/