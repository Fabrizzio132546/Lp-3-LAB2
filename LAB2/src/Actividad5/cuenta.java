package Actividad5;

public abstract class cuenta { //clase
    protected String numerocuenta;
    protected double saldo;

    public cuenta(String numerocuenta, double saldo) {
        this.numerocuenta = numerocuenta;
        this.saldo = saldo;
    }
    
    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) {
        saldo -= monto;
    }

    public double getsaldo() {
        return saldo;
    }

    public abstract void consultar();
}
