package ModificadorDeAcceso;
/*🔨 Paso 4: Desafío Práctico
Ahora que entiendes los tres modificadores de acceso, vamos a usarlos en un proyecto simple. Crea un
programa que modele una Cuenta Bancaria con los siguientes pasos:

Crea una clase llamada CuentaBancaria con los siguientes atributos:

titular (público),
saldo (privado),
tipoCuenta (protegido).
Añade métodos públicos depositar y retirar para modificar el saldo.

Crea una subclase llamada CuentaAhorro que herede de CuentaBancaria y tenga un método que muestre el
tipo de cuenta.

En el método main, crea una instancia de CuentaAhorro, establece un saldo inicial y realiza una
operación de depósito o retiro.*/
public class CuentaBancaria {
    public String titular;
    private double saldo;
    protected String tipoCuenta;

    // Constructor para inicializar la cuenta
    public CuentaBancaria(String titular, double saldoInicial, String tipoCuenta) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.tipoCuenta = tipoCuenta;
    }

    // Método para depositar
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Has depositado: " + cantidad);
        } else {
            System.out.println("Cantidad no válida para depositar");
        }
    }

    // Método para retirar
    public void retirar(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Has retirado: " + cantidad);
        } else {
            System.out.println("Saldo insuficiente o cantidad no válida");
        }
    }

    // Método para mostrar el saldo
    public void mostrarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }
}

