public class CuentaCorriente implements CuentaBancaria {
    private double saldo;
    private double limiteSobregiro;

    public CuentaCorriente(double saldoInicial, double limiteSobregiro) {
        this.saldo = saldoInicial;
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    @Override
    public void retirar(double cantidad) {
        if (saldo - cantidad >= -limiteSobregiro) {
            saldo -= cantidad;
        } else {
            System.out.println("No se puede retirar más de lo permitido.");
        }
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }
}
