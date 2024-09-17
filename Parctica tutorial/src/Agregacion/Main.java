package Agregacion;

public class Main {
    public static void main(String[] args) {
        Departamento departamento = new Departamento("IT");

        Empleado empleado1 = new Empleado("Carlos");
        Empleado empleado2 = new Empleado("Ana");

        departamento.agregarEmpleado(empleado1);
        departamento.agregarEmpleado(empleado2);

        departamento.mostrarEmpleados();  // Muestra los empleados del departamento IT
    }
}
