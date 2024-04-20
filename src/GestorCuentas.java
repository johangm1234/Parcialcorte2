import java.util.ArrayList;
import java.util.List;
public class GestorCuentas {
    private List<CuentaBancaria> cuentas;

    public GestorCuentas() {
        this.cuentas = new ArrayList<>();
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

    public void depositar(int indice, double cantidad) {
        cuentas.get(indice).depositar(cantidad);
    }

    public void retirar(int indice, double cantidad) {
        cuentas.get(indice).retirar(cantidad);
    }

    public double consultarSaldo(int indice) {
        return cuentas.get(indice).consultarSaldo();
    }
}