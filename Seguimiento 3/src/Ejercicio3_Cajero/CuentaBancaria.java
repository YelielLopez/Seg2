package Ejercicio3_Cajero;

import java.util.Scanner;

class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private boolean estado;
    private String claveSeguridad;


    public CuentaBancaria(String numeroCuenta, double saldoInicial, boolean estadoInicial, String claveSeguridad) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.estado = estadoInicial;
        this.claveSeguridad = claveSeguridad;
    }


    public void consultarSaldo() {
        System.out.println("Saldo actual: $" + saldo);
    }


    public void retirarEfectivo(double valor) {
        if (estado && saldo >= valor) {
            saldo -= valor;
            System.out.println("Has retirado: $" + valor);
            System.out.println("Nuevo saldo: $" + saldo);
        } else {
            System.out.println("No se pudo completar la operación. Saldo insuficiente o cuenta inactiva.");
        }
    }


    public void consignarEfectivo(double valor) {
        if (estado) {
            saldo += valor;
            System.out.println("Has consignado: $" + valor);
            System.out.println("Nuevo saldo: $" + saldo);
        } else {
            System.out.println("No se pudo completar la operación. Cuenta inactiva.");
        }
    }


    public void cambiarClave() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la clave actual: ");
        String claveActual = scanner.nextLine();

        if (claveActual.equals(claveSeguridad)) {
            System.out.print("Ingrese la nueva clave: ");
            String nuevaClave = scanner.nextLine();
            claveSeguridad = nuevaClave;
            System.out.println("Clave cambiada exitosamente.");
        } else {
            System.out.println("Clave incorrecta. No se pudo cambiar la clave.");
        }
    }
}



