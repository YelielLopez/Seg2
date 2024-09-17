package ModificadorDeAcceso;

public class CuentaAhorro extends CuentaBancaria {
    public CuentaAhorro(String titular, double saldoInicial) {
        // Llama al constructor de la clase padre
        super(titular, saldoInicial, "Ahorro");
    }

    // Método para mostrar el tipo de cuenta
    public void mostrarTipoCuenta() {
        System.out.println("Tipo de cuenta: " + tipoCuenta);
    }
}
