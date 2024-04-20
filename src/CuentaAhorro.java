public class CuentaAhorro implements CuentaBancaria {
    private double saldo;
    private double tasaInteres;

    public CuentaAhorro(double saldoInicial, double tasaInteres) {
        this.saldo = saldoInicial;
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    @Override
    public void retirar(double cantidad) {
        if (saldo - cantidad >= 0) {
            saldo -= cantidad;
        } else {
            System.out.println("No hay suficiente saldo para retirar.");
        }
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }
}

