package Agregacion;
/*🎯 Tarea 1: Crear una Relación de Agregación
Crea una clase Departamento con un atributo nombre.
Crea una clase Empleado que contenga una referencia a Departamento.
En el método main, crea un Departamento y un Empleado, y luego muestra qué departamento tiene el empleado.*/
// Clase Departamento

/*🎯 Tarea 2: Agregación de Múltiples Objetos
Modifica la clase Departamento para que pueda contener una lista de Empleado.
Crea un método agregarEmpleado() que permita agregar varios empleados a un departamento.
Crea una instancia de Departamento, agrega varios empleados y muestra la lista de empleados del departamento.*/
import java.util.ArrayList;

// Clase Departamento
public class Departamento {
    private String nombre;
    private ArrayList<Empleado> empleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarEmpleados() {
        System.out.println("Empleados en el departamento " + nombre + ":");
        for (Empleado empleado : empleados) {
            System.out.println("- " + empleado.getNombre());
        }
    }
}

/*❓ Preguntas de Selección Múltiple
¿Qué es la agregación en Java?

A) Una relación en la que una clase contiene otras clases que dependen de ella.
B) Una relación en la que una clase contiene referencias a otras clases, pero estas pueden existir independientemente.
C) Una relación donde los objetos deben ser destruidos juntos.
D) Una relación de "es un" entre clases.
Respuesta: B

¿Qué diferencia principal tiene la agregación respecto a la composición?

A) En la agregación, los objetos relacionados no pueden existir independientemente.
B) En la composición, los objetos pueden existir independientemente.
C) En la agregación, los objetos relacionados pueden existir de manera independiente.
D) No hay diferencia entre agregación y composición.
Respuesta: C

En una relación de agregación, si se elimina la clase que contiene, ¿qué ocurre con los objetos agregados?

A) Los objetos agregados se eliminan automáticamente.
B) Los objetos agregados siguen existiendo de manera independiente.
C) Los objetos agregados se vuelven inaccesibles.
D) Los objetos agregados se duplican.
Respuesta: B*/

