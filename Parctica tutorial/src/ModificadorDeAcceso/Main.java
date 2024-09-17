package ModificadorDeAcceso;

public class Main {
    public static void main(String[] args) {
        // Crea una instancia de CuentaAhorro
        CuentaAhorro cuenta = new CuentaAhorro("Juan Pérez", 500.0);

        // Muestra el tipo de cuenta
        cuenta.mostrarTipoCuenta();

        // Realiza operaciones de depósito y retiro
        cuenta.mostrarSaldo(); // Muestra el saldo inicial
        cuenta.depositar(200.0); // Deposita 200
        cuenta.mostrarSaldo(); // Muestra el saldo después del depósito
        cuenta.retirar(100.0); // Retira 100
        cuenta.mostrarSaldo(); // Muestra el saldo después del retiro
    }
}
