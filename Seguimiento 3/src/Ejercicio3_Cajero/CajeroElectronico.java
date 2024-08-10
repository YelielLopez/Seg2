package Ejercicio3_Cajero;

import java.util.Scanner;

public class CajeroElectronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CuentaBancaria cuenta = new CuentaBancaria("123456789", 1000.00, true, "1234");

        int opcion;
        do {
            System.out.println("\nCajero Electrónico");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar efectivo");
            System.out.println("3. Consignar efectivo");
            System.out.println("4. Cambiar clave");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    cuenta.consultarSaldo();
                    break;
                case 2:
                    System.out.print("Ingrese el monto a retirar: ");
                    double montoRetiro = scanner.nextDouble();
                    cuenta.retirarEfectivo(montoRetiro);
                    break;
                case 3:
                    System.out.print("Ingrese el monto a consignar: ");
                    double montoConsignacion = scanner.nextDouble();
                    cuenta.consignarEfectivo(montoConsignacion);
                    break;
                case 4:
                    cuenta.cambiarClave();
                    break;
                case 5:
                    System.out.println("Gracias por usar el cajero electrónico.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
