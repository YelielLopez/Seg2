package ModificadorDeAcceso;
/*🎯 Tarea 1: Usando public
Crea una clase llamada Coche con un atributo llamado marca.
Añade un método public llamado mostrarMarca que imprima la marca del coche.
En el método main, crea una instancia de Coche, asigna un valor a marca y llama al método mostrarMarca.*/
    public class Coche {
        //Atrubutos
        private String marca;

        /*🎯 Tarea 2: Usando private
En tu clase Coche, marca el atributo marca como private.
Crea métodos públicos setMarca y getMarca para modificar y obtener el valor de marca.
En el método main, usa setMarca para asignar un valor y getMarca para mostrar la marca del coche.
*/

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Método
        public void MostrarMarca(){
            System.out.println("Marca: "+ getMarca());


        }
        public static void main(String[] args) {
            Coche coche = new Coche();

            coche.setMarca("Toyota");

            coche.MostrarMarca();
        }
    }

    /*El modificador protected permite que los atributos y métodos sean accesibles dentro de la misma clase,
     sus subclases (herencia) y otras clases del mismo paquete.
     */

//Por ejemplo
/*
public class Persona {
    // Atributo protegido
    protected String nacionalidad;

    // Método protegido
    protected void mostrarNacionalidad() {
        System.out.println("Nacionalidad: " + nacionalidad);
    }
}

public class Estudiante extends Persona {
    public void infoEstudiante() {
        mostrarNacionalidad();  // Método protegido accesible en la subclase
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nacionalidad = "Española";  // Acceso permitido a un atributo protegido
        estudiante1.infoEstudiante();  // Acceso al método protegido desde la subclase
    }
}
*/

/*❓ Preguntas de Selección Múltiple
¿Cuál es el modificador de acceso que permite que un atributo sea visible en todo el programa?

A) private
B) protected
C) public ✔
D) Ninguno de los anteriores
¿Qué ocurre si un atributo es private en una clase?

A) Solo puede ser accedido desde métodos dentro de la misma clase. ✔
B) Puede ser accedido desde subclases.
C) Puede ser accedido desde cualquier parte del programa.
D) Solo puede ser accedido desde el mismo paquete.
¿Cuál de los siguientes modificadores permite que una subclase acceda a un atributo de su clase padre?

A) private
B) protected ✔
C) public
D) Ninguno

 */

